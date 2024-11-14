// To develop a program to find an average of an array using AVG function.

import java.util.Random;

public class average_of_array {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for( int i = 0 ; i < 10 ; i++ ){
            Random rand = new Random();
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nAverage of the array is : " + AVG(arr) );
    }
    public static double AVG( int arr[] ){
        double sum = 0;
        for( int i = 0 ; i < arr.length ; i++ ) sum += arr[i];
        sum = sum/10;
        return sum;
    }
}
