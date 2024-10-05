// package Sorting;
public class Quick_sort {
    public static int[] sort_by_quick( int arr[] , int upper , int lower ) {
        if( lower > upper ) return arr;
        int pivot = partition( arr , upper , lower );
        sort_by_quick(arr, pivot-1, lower);
        sort_by_quick(arr, upper, pivot+1);
        return arr;
    }
    public static int partition( int []arr , int high , int low ){
        int pi = arr[high];
        int index = low;
        for( int i = low ; i < high ; i++ ){
            if( arr[i] <= pi ){
                int a = arr[index];
                arr[index] = arr[i];
                arr[i] = a;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[high];
        arr[high] = temp;

        return index;
    }
    public static void main(String[] args) {
        int arr[] = { 8 , 2 , 1 , 6 , 9 , 3 , 8 };
        arr = sort_by_quick( arr , arr.length - 1 , 0 );
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }
}