// package Sorting;
public class Quick_sort {
    public static int[] sort_by_quick( int arr[] , int upper , int lower ) {
        if( lower > upper ) return arr;
        int pivot = lower;
        for( int i = lower ; i <= upper ; i++ ){
            if( arr[pivot] > arr[i] ){
                int a = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = a;
            }
        }
        sort_by_quick( arr , upper , pivot + 1 );
        
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 8 , 2 , 1 , 6 , 9 , 3 , 8 };
        arr = sort_by_quick( arr , arr.length - 1 , 0 );
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }
}