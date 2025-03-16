import java.util.Scanner;

public class maximum_water { 
    public static int find_maximum( int arr[] , int i , int max ){
        if( i == arr.length ) return max;
        if( arr[i] > arr[max] ) max = i;
        return find_maximum(arr, i+1, max);
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

        int max = find_maximum( arr , 0 , 0 );
        int a = arr[max];
        arr[max] = 0;
        int second_max = find_maximum(arr, 0, 0);
        arr[max] = a;
        int base = max - second_max;
        if( base < 0 ) base = second_max - max;
        System.out.println("Total Area is : " + base*arr[second_max] );
        sc.close();
    }
}
