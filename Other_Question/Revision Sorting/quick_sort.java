public class quick_sort {
    public static void sort( int arr[] , int left , int right ) {
        if( left >= right ) return;
        
        int pivot = partition( arr , left , right );
        sort(arr, left, pivot-1);
        sort(arr, pivot+1, right);
    }
    public static int partition( int arr[] , int low , int high ){
        int pivot = arr[high];
        int index = low;

        for( int i = low ; i < high ; i++ ){
            if( arr[i] < pivot ){
                swap(arr, index, i);
                index++;
            }
        }

        swap(arr, high, index);
        return index;
    }
    public static void swap( int arr[] , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void display( int arr[] ){
        for( int i = 0; i  < arr.length ; i++ ) System.out.print( arr[i] + "\t" );
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 38, 13, 90, 96, 33, 69, 25, 98, 11, 23, 53, 10 };
        sort(arr , 0 , arr.length-1);
        display(arr);
    }
}
