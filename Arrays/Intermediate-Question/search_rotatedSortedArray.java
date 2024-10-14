public class search_rotatedSortedArray {
    public static int findPivot(int arr[]) {
        for( int i = 0 ; i < arr.length-1 ; i++ ){
            if( arr[i+1] < arr[i] ){
                return i;
            }
        }
        return 0;
    }
    public static boolean search( int nums[] , int target ) {
        int pivot = findPivot(nums);
        int left = 0;
        int right = nums.length-1;
        if(  )
    }
    public static void main(String[] args) {
        int arr[] = { 2,5,6,0,0,1,2 };
        int arr1[] = { 1,0,1,1,1 };
        int arr2[] = { 1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1 };
        System.out.println(search(arr  , 1));
        System.out.println(search(arr1 , 1));
        System.out.println(search(arr2 , 1));
    }
}
