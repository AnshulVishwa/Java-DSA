import java.util.*;
public class kth_largest_smallest {
    public static int[] find_kth_largest_smallest( int arr[] , int k , int max , int min ){
        int index = 0;
        int min_index = 0;
        for( int i = 0 ; i < arr.length ; i++ ){
            if( i == 0 ) max = arr[0]; min = arr[0];
            if( arr[i] > max ) {
                max = arr[i];
                index = i;
            }
            if( arr[i] < min ){
                min = arr[i];
                min_index = i;
            }
        }
        if( k != 1 ) {
            arr[index] = 0 ;
            arr[min_index] = arr[0] ;
        }
        if( k == 1 ){
            arr[0] = max;
            arr[1] = min;
            return arr;
        }
        return find_kth_largest_smallest(arr, k-1, max,min);
    }
    public static void main(String[] args) {
        System.out.println("Do Not Enter Repeated Numbers");
        Scanner sc = new Scanner( System.in );
        System.out.print("Enter the length of the array : ");
        int length = sc.nextInt();

        int arr[] = new int[length];

        for( int i = 0 ; i < length ; i++ ){
            System.out.print("Enter " + (int)(i+1) + " element value : ");
            arr[i] = sc.nextInt();
            if( i == length - 1 ) System.out.println("Array is Formed"); 
        }
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        arr = find_kth_largest_smallest( arr , k , arr[0] , arr[0] );
        System.out.println("Kth largest element is " + arr[0]);
        System.out.println("Kth Smallest element is " + arr[1]);
        sc.close();
    }
}
