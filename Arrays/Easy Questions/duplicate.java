import java.util.Scanner;
public class duplicate {
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

        boolean say = false;

        System.out.println("Checking for duplicate");

        for( int i = 0 ; i < arr.length ; i++ ){
            for( int j = 0 ; j < arr.length ; j++ ){
                if( i == j ) continue;
                if( arr[i] == arr[j] ) say = true; break; 
            }
        }

        if( say ) System.out.println("There is a duplicate in this array.");
        else System.out.println("No Duplicate in this array");
    }
}
