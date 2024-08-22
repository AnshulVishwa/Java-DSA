import java.util.Scanner;

public class find_minimum_rotated {
    public static int[] sort_array( int arr[] , int lower , int upper ){
        if( lower > upper ) return arr;
        int pivot = lower;
        for( int i = 0 ; i <= pivot ; i++ ){
            if( arr[i] > arr[pivot] ){
                int a = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = a;
            }
        }
        return sort_array( arr , lower + 1 , upper );
    }
    public static int[] rotate_arr( int arr[] , int front , int back ){
        if( front == arr.length/2 ) return arr;
        int a = arr[front];
        arr[front] = arr[back];
        arr[back] = a;
        return rotate_arr(arr, front+1, back-1);
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

        arr = sort_array( arr , 0 , arr.length - 1 );
        // for( int i = 0 ; i < arr.length ; i++ ) System.out.print( arr[i] + "\t" );
        arr = rotate_arr(arr , 0 , arr.length - 1 );
        // for( int i = 0 ; i < arr.length ; i++ ) System.out.print( arr[i] + "\t" );
        int minimum = arr[ arr.length - 1 ];
        System.out.println( "minimum : " + minimum );
    }
}
