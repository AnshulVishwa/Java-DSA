// Here we will shift all 0's in the starting and all 2's to the end 
public class sort_array {
    public static void sort_colors( int nums[] ){
        // variable strating from 1st index for 0s
        int ball0 = 0;
        // variable strating from last index for 2s
        int ball2 = nums.length-1;

        // Loop for shifting all 0s to front
        for( int i = 0 ; i < nums.length ; i++ ){
            if( nums[i] == 0 ){
                int temp = nums[i];
                nums[i] = nums[ball0];
                nums[ball0++] = temp;
            }
        }
        // Loop for shifting all 2s to back
        for( int i = nums.length-1 ; i >= 0 ; i-- ){
            if( nums[i] == 2 ){
                int temp = nums[i];
                nums[i] = nums[ball2];
                nums[ball2--] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,0,1,2,0,1,2,0,2,1};
        sort_colors(nums);
        for( int i = 0 ; i < nums.length ; i++ ) System.out.print(nums[i] + "\t");
    }
}
