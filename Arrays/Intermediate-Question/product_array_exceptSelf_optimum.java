// Find Prefix and suffix then mulitply their respective values
public class product_array_exceptSelf_optimum {
    public static int[] productExceptSelf(int[] nums) {
        
        int answer [] = new int[nums.length];
        
        for( int i = 0 ; i < nums.length ; i++ ){
            if( i == 0 ){
                nums[i] = 1;
                answer[i] = 1;
                continue;
            }
            answer[i]=answer[i-1] * nums[i-1];
        }
        int suffix = 1;
        for( int j = nums.length-1 ; j >= 0 ; j-- ){
            if( j == nums.length-1 ){
                continue;
            }
            suffix *= nums[j+1];
            answer[j] *= suffix;
        }
        return answer;
    }
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 3 , 4 , 5 };
        productExceptSelf( arr );
    } 

}
