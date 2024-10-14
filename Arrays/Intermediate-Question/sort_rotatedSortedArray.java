public class sort_rotatedSortedArray {
    public static int[] sortArray( int arr[] ) {
        int pivot = 0;
        for( int i = 0 ; i < arr.length-1 ; i++ ){
            if( arr[i+1] < arr[i] ) {
                pivot = i;
                break;
            }
        }
        if( pivot == 0 ) return arr;
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
        for( int i = 0 ; i < arr.length ; i++ ) System.out.print(newArr[i] + "\t");
        return newArr;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,2};
        sortArray(arr);
    }
}
