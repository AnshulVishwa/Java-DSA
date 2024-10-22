// package Sorting;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 100 , 4 , 8 , 800 , 9 , 50 , 6 , 2};
        for( int i = 0 ; i < arr.length ; i++ ){
            for( int j = 0 ; j < arr.length ; j++ ){
                if( arr[j] > arr[i] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Show Array
        for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");
    }
}