// Reverse The Array
import java.util.Scanner;
public class reverse {
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

        System.out.println("Reverse of this Array is");

        for( int i = 0 , x = arr.length - 1 ; i < arr.length/2 ; i++ ){
            x = arr.length - 1 - i;
            int a = arr[i];
            arr[i] = arr[x];
            arr[x] = a;
        }
        for( int i = 0; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");
    }
}
