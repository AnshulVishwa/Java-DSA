// Find the Prefix and suffix of all nums
public class product_Array_exceptSelf{
    public static int[] productExceptSelf(int[] nums) {
        // Method to find Prefix
        int prefix[] = new int[nums.length];
        prefix[0] = 1;
        for( int i = 1 ; i < nums.length ; i++ ) prefix[i] = nums[i-1]*prefix[i-1];
        
        // Method to find Suffix
        int suffix[] = new int[nums.length];
        suffix[nums.length-1] = 1;
        for( int i = nums.length-2 ; i >= 0 ; i-- )suffix[i] = suffix[i+1]*nums[i+1];

        // Calculate Final ans
        for( int i = 0; i < nums.length ; i++ ) nums[i] = prefix[i]*suffix[i];
        
        return nums;
    }
    
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 3 , 4 , 5 };
        productExceptSelf( arr );
    } 
}