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
        Scanner sc = new Scanner( System.in );
        System.out.print("Enter the length of the array : ");
        int length = sc.nextInt();

        int arr[] = new int[length];

        for( int i = 0 ; i < length ; i++ ){
            System.out.print("Enter " + (int)(i+1) + " element value : ");
            arr[i] = sc.nextInt();
            if( i == length - 1 ) System.out.println("Array is Formed"); 
        }

        int another_arr[] = new int[arr.length];

        another_arr = product_of_array_except_itself( arr , another_arr , 0 );
        for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");
        System.out.println();
        for( int i = 0 ; i < another_arr.length ; i++ ) System.out.print(another_arr[i] + "\t");
    }
}
