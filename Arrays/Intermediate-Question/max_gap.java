import java.util.Arrays;

public class max_gap {
    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max = nums[1]-nums[0];
        for( int i = 1 ; i < nums.length-1 ; i++ ){
            if( nums[i+1] - nums[i] > max ) max = nums[i+1] - nums[i];
        }
        System.out.println(max);
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = { 5 , 8 , 1 , 2 };
        System.out.println(maximumGap(nums));
    }
}
