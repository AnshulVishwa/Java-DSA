public class sort_rotatedSortedArray {
    public static int[] sortArray( int arr[] ) {
        int pivot = 0;
        for( int i = 0 ; i < arr.length-1 ; i++ ){
            if( arr[i+1] < arr[i] ) {
                pivot = i;
                break;
            }
        }
        int index = pivot+1;
        int newArr[] = new int[arr.length];
        int start = 0;
        do{
            newArr[start] = arr[index];
            start++;
            index++;
            if( index == arr.length ) index = 0;
        }
        while( index != pivot+1 );
        return newArr;
    }
    public static void main(String[] args) {
        int arr[] = {11, 15, 26, 38, 9, 10};
        sortArray(arr);
    }
}
