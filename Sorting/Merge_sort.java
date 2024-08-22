// package Sorting;

public class Merge_sort {
    public static int[] next_arr( int arr[] ){
        int mid = arr.length / 2;
        int arr1[] = new int[mid];
        int arr2[] = new int[mid + 1];

        for( int i = 0 ; i < mid ; i++ ){
            arr1[i] = arr[i];
        }
        for( int i = mid ; i < arr.length ; i++ ){
            arr2[i] = arr[i];
        }

        if( arr1.length != 1 ){
            next_arr(arr1);
        }
        if( arr2.length != 2 ){
            next_arr(arr2);
        }

    }
    public static int[] merge_by_sort( int arr[] , int arr2[] ){
        int new_arr[] = new int[ arr.length + arr2.length ];
        int first = 0;
        int second = 0;
        for( int i = 0 ; i < arr.length ; i++ ){
            for( int j = 0 ; j < arr2.length ; j++ ){
                if( arr[j] < arr[i] ){
                    first = arr[j];
                    second = arr[i];
                }
                else{
                    first = arr[i];
                    second = arr[j];
                }
            }
        }
        for( int i = 0 ; i < new_arr.length - 1 ; i++ ){
            new_arr[i] = first;
            new_arr[i+1] = second;
        }
        return new_arr;
    }
    public static void main(String[] args) {
        int arr[] = { 5 , 1 , 3 , 9 , 6 , 7 };
    }
}
