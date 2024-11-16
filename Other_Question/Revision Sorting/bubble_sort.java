public class bubble_sort {
    public static void sort( int arr[] ) {
        for( int i = 0 ; i < arr.length ; i++ ){
            for( int j = 0 ; j < arr.length ; j++ ){
                if( arr[i] < arr[j] ){
                    swap(arr, i, j);
                }
            }
        }
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
        sort(arr);
        display(arr);
    }
}
