public class selection_sort {
    public static void main(String[] args) {
        int arr[] = { 100 , 400 , 800 , 800 , 900 , 500 , 600 , 200 };
        for( int i = 0 ; i < arr.length ; i++ ){
            int min_index = i;
            
            // Find the smallest Number of the Array and store its index.
            for( int j = i + 1 ; j < arr.length ; j++ ) {
                if( arr[j] < arr[min_index] ) min_index = j;
            }
            
            // if the value of i does not change then there will be no swapping
            if( i == min_index ) continue;
            else{
                int a = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = a;
            }

        }
        // Show Array
        for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");
    }
}
