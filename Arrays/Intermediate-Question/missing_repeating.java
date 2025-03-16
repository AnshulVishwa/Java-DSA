import java.util.Scanner;

public class missing_repeating {
    public static int check_missing( int arr[] , int difference , int missing ){
        int differ_arr[] = new int[ arr.length - 1 ];
        for( int i = 0 ; i < arr.length - 1 ; i++ ){
            differ_arr[i] = arr[i+1] - arr[i];
        }
        for( int i = 0 ; i < differ_arr.length ; i ++ ){
            for( int j = 0 ; j < differ_arr.length ; j++ ){
                if( i == j ) continue;
                if( differ_arr[i] == differ_arr[j] ) difference = differ_arr[i];
            }
        }
        
        for( int i = 0 ; i < arr.length ; i++ ){
            for( int j = 0 ; j < arr.length ; j++ ) {
                if( i == j ) continue;
                if( arr[i] == arr[j] ) System.out.println("Repeating : " + arr[i]); break;
            }
        }

        for( int i = 0 ; i < arr.length-1 ; i++ ){
            if( arr[i] + difference != arr[i+1] ) missing = arr[i] + difference;
        }


        return missing;
    }
    // Runner.prototype.gameOver = function (){}
    public static void main(String[] args) {
        System.out.println("Note : First Element should not be Missed");
        Scanner sc = new Scanner( System.in );
        System.out.print("Enter the length of the array : ");
        int length = sc.nextInt();

        int arr[] = new int[length];

        for( int i = 0 ; i < length ; i++ ){
            System.out.print("Enter " + (int)(i+1) + " element value : ");
            arr[i] = sc.nextInt();
            if( i == length - 1 ) System.out.println("Array is Formed"); 
        }

        int missing = check_missing( arr , 0 , 0 );
        System.out.println("missing : " + missing);
        sc.close();
    }
}
