public class selection_sort {
    public static void main(String[] args) {
        int arr[] = { 1 , 4 , 8 , 8 , 9 , 5 , 6 , 2 };
        for( int i = 0 ; i < arr.length ; i++ ){
            int min_index = i;
            for( int j = i+1 ; j < arr.length ; j++ ){
                if( arr[j] < arr[min_index] ) min_index = j;
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        // Show Array
        for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");
    }
}
