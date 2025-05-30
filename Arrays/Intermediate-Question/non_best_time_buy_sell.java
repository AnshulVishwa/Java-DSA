// Not Optimized
import java.util.Scanner;
public class non_best_time_buy_sell {
    public static int find_minimum( int arr[] , int i , int min ){
        
        if( i == arr.length ) return min;

        if( arr[i] < arr[min] ){
            min = i;
        }
        
        return find_minimum( arr , i + 1 , min );
    }
    public static int best_time_to_buy_sell( int arr[] , int i , int min ){
        if( min == arr.length - 1 ){
            return -1; // There is no Best time to sell and buy cuz the lowest is at last.
        }
        if( arr[i] == arr[min] ){
            int max = arr[i];
            for( int j = min ; j < arr.length ; j++ ){
                if( arr[j] > arr[max] ) max = j;
            }
            if( arr[max] < arr[min] ) return -3; // There is no Maximum outcome.
            else return arr[max] - arr[min];
        }

        return best_time_to_buy_sell(arr, i+1, min);
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
        int minimum_index = find_minimum( arr , 0 , 0 ); 
        int outcome = best_time_to_buy_sell( arr , 0 , minimum_index );
        if( outcome == -1 ) System.out.println( "There is no Best time to sell and buy cuz the lowest is at last." );
        else if( outcome == -3 ) System.out.println( "There is no maximum than minimum" );
        else System.out.println( "Outcome is : " + outcome );
        sc.close();
    }
}
