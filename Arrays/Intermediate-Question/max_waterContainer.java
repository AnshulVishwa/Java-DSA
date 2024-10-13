public class max_waterContainer {
    public static int traverse_Array( int arr[] , int left , int right , int max ) {
        if( left > right ) return max;
        max = Math.max(Math.min( arr[left] , arr[right] )*(right-left) , max);
        if( arr[left] > arr[right] ) right--;
        else left++;

        return traverse_Array(arr, left, right, max);
    }
    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 2, 7, 1, 2, 5, 1, 1, 2 };
        int max = traverse_Array( arr , 0 , arr.length-1 , 0 );
        System.out.println(max);
    }
}
