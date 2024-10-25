public class Merge_sort {
    public static void sort(int arr[] , int mid , int first , int last) {
        int merged[] = new int[ last - first + 1 ];
        int i1 = first;
        int i2 = mid+1;
        int index = 0;

        while ( i1 <= mid && i2 <= last ) {
            if( arr[i1] <= arr[i2] ){
                merged[index++] = arr[i1++]; 
            }
            else{
                merged[index++] = arr[i2++]; 
            }
        }
        while ( i1 <= mid ) {
            merged[index++] = arr[i1++];
        }
        while ( i2 <= last ) {
            merged[index++] = arr[i2++];
        }

        for( int i = 0 , j = first ; j <= last ; i++ , j++ ){
            arr[j] = merged[i];
        }

    }
    public static void divide( int arr[] , int first , int last ) {
        if( first >= last ) return;
        int mid = first + ( last - first ) / 2;
        divide(arr, first, mid);
        divide(arr, mid+1, last);
        sort(arr, mid, first, last);
    }
    public static void main(String[] args) {
        int arr[] = { 8 , 1 , 3 , 4 , 6 , 0 , 8 };
        divide(arr, 0, arr.length-1);
        for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");
    }
}