public class Trapping_Rain_Water {
    public static int find_maximum_num_index( int arr[] , int i , int max , int index ){
        if( i == arr.length ) return index;

        if( max < arr[i] ) {
            index = i;
            max = arr[i] ; 
        }

        return find_maximum_num_index( arr , i + 1 , max , index );
    }
    public static int[] reverse_array( int arr[] , int i , int j ){
        // i = First Index
        // j = Last Index
        if( i == arr.length/2 ) return arr;
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
        return reverse_array( arr , i + 1 , j - 1 ); 
    }
    public static int Total_Water_Stored( int arr[] , int total ){
        int a = arr[arr.length-1];
        arr[arr.length-1] = 0;
        int second_max_index = find_maximum_num_index( arr , 0 , arr[0] , 0 );
        arr[arr.length-1] = a;
        for( int j = 0 ; j < arr.length - 1 ; j++ ){
            if( j >= second_max_index ){
                int kk = arr[second_max_index] - arr[j]; 
                arr[j] += kk; 
                total += kk;
            }
            else{
                if( arr[j+1] < arr[j] ){ 
                    total += arr[j] - arr[j+1];
                    arr[j+1] = arr[j];
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int arr[] = {3 , 4  , 2 , 1 , 0 , 5 , 2 , 1 , 3};
        int max = find_maximum_num_index( arr , 0 , arr[0] , 0 ); // Finding maximum Number's Index
        int arr1[] = new int[max+1];
        int arr2[] = new int[arr.length - max];
        
        // Assiging values to arr1
        for( int i = 0 ; i < arr1.length ; i++ ) arr1[i] = arr[i];
        
        // Assiging values to arr2
        for( int i = 0 , j = max ; i < arr1.length && j < arr.length ; i++ ) {
            arr2[i] = arr[j];
            j = j + 1;
        }
        
        // Reversing the Array2 after the index max
        arr2 = reverse_array( arr2 , 0 , arr2.length-1 );
        int total = Total_Water_Stored( arr1 , 0 );
        total = Total_Water_Stored(arr2, total);
        System.out.println("total : " + total);
    }
}
