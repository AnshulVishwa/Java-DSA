import java.util.Arrays;

public class first_missing_pos {
    public static void main(String[] args) {
        int nums[] = {1,2,0};
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        int smallest = 1;
        for( int i = 0 ; i < nums.length ; i++ ){
            if( nums[i] < 0 ) continue;
            if( nums[i] == smallest ) smallest++;
        }
        System.out.println(smallest);
    }
}
