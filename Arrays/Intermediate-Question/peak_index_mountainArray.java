public class peak_index_mountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        if( arr.length == 0 ) return 0;
        if( arr.length == 1 ) return arr[0];
        if( arr.length == 2 ) return ( arr[0] > arr[1] ) ? arr[0] : arr[1];
        int i = 0;
        int j = arr.length-1;
        int max = i;
        while( i <= j ){
            if( arr[i] > arr[max] ) max = i;
            if( arr[j] > arr[max] ) max = j;
            i++;
            j--;
        }
        return arr[max];
    }
    public static void main(String[] args) {
        int arr[] = { 9 , 2 };
        System.out.println(peakIndexInMountainArray(arr));
    } 
}
