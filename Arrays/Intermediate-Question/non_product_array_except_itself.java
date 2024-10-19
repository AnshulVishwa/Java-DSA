// Not Optimized
import java.util.*;
public class product_array_except_itself {
    public static int[] product_of_array_except_itself( int arr[] , int another_arr[] , int i ){
        if( i == arr.length ) return another_arr;
        int product = 1;
        for( int j = 0 ; j < arr.length ; j++ ){
            if( j == i ) continue;
            product *= arr[j];
        }
        another_arr[i] = product;
        return product_of_array_except_itself(arr, another_arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = { 2 , 4 , 5 , 7 };
        another_arr =  , product_of_array_except_itself( arr , another_arr , 0 ); 
        for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");
        System.out.println();
        for( int i = 0 ; i < another_arr.length ; i++ ) System.out.print(another_arr[i] + "\t");
    }
}
