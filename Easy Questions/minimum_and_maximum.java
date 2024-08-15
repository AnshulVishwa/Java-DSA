// Find the minimum and the maximumm element in an array

import java.util.Scanner;
public class minimum_and_maximum {
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

        int min = 0;
        int max = 0;

        for( int i = 0 ; i < length ; i++ ){
            if( i == 0 ) {
                min = arr[i];
                max = arr[i];
            }
            if( arr[i] < min ) min = arr[i];
            else if( arr[i] > max ) max = arr[i];
        }

        System.out.println("The minimum element in an array is : " + min);
        System.out.println("The maximum element in an array is : " + max);
    }
}