public class find_minimum_rotated{
    public static int findMin( int nums[] ) {
        if (nums.length == 1) return nums[0];
        int min = nums[0];
        for( int n : nums ){
            min = Math.min( min , n );
        }        
        return min;
    }
    public static void main(String[] args) {
        int arr[] = { 1 , 4  , 7 , 5 ,, 9 , 0 };
        int min = findMin(arr);
        System.out.println(min);
    }
}