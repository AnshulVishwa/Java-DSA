import java.util.Scanner;

class next_permutation{

    public static int permutation_value( int i , int p ){
        if( i == 1 ) return p;
        return permutation_value( i - 1 , p * i);
    }

    public static int[][] all_permutation( int arr[] , int i , int swap , int all[][] ){
        if( all.length == i ) return all;

        if( swap + 1 == arr.length ) swap = 0;

        int a = arr[ swap ];
        arr[ swap ] = arr[ swap + 1 ];
        arr[ swap + 1 ] = a;

        for( int j = 0 ; j < arr.length ; j++ ){
            all[i][j] = arr[j];
        }

        return all_permutation( arr , i+1 , swap + 1 , all );
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

        int outcomes = permutation_value( arr.length , 1 );
        int all[][] = new int[outcomes][arr.length];
        all = all_permutation( arr , 0 , 0 , all );
        for( int i = 0 ; i < all.length ; i++ ){
            System.out.print("[ \t");
            for( int j = 0 ; j < all[i].length ; j++ ){
                System.out.print( all[i][j] + " \t ");
            }
            System.out.print(" ]");
            System.out.println();
        }
    }

}