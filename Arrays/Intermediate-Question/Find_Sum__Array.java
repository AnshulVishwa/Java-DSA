import java.util.Scanner;

public class Find_Sum__Array {
    public static boolean find_sum( int arr[] , int sum ){
        for( int i = 0 ; i < arr.length ; i++ ){
            for( int j = 0 ; j < arr.length ; j++ ){
                if( i == j ) continue;
                if( arr[i] + arr[j] == sum ) return true;
            }
        }
        return false;
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

        System.out.print("What's the sum you want to find : ");
        int sum = sc.nextInt();
        boolean say = find_sum( arr , sum );
        System.out.println(say);
        sc.close();
    }
}
