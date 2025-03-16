import java.util.Scanner;


public class chocolate_distribution {
    public static int[] sort_array( int arr[] ){
        for( int j = arr.length - 1 ; j >= 0 ; j-- ){
            for( int k = 0 ; k < j ; k++ ){
                if( arr[j] < arr[k] ){
                    int a = arr[j];
                    arr[j] = arr[k];
                    arr[k] = a;
                }
            }
        }
        return arr;
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

        System.out.print("Enter the no. of Children : ");
        int children = sc.nextInt();

        System.out.println("Sorting this array");
        
        arr = sort_array( arr );

        int new_arr[] = new int[children];

        for( int i = 0 ; i < children ; i++ ) new_arr[i] = arr[i];

        System.out.print("The arranged packets will be : \t");

        for( int i = 0 ; i < new_arr.length ; i++ ) System.out.print(new_arr[i] + "\t");

        System.out.println("\nThe Minimum differnce will be : " + (int)(new_arr[new_arr.length-1] - new_arr[0]));
        sc.close();
    }
}
