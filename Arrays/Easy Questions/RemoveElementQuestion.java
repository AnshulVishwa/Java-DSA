public class RemoveElementQuestion {
    
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for( int i = 0 ; i < nums.length ; i++ ){
            if( nums[i] != val ){
                nums[index] = nums[i];
                index++;
            }
        }
        for( int i = 0 ; i < index ; i++ ) System.out.print(nums[i] + "\t");
        System.out.println();
        System.out.println(index);
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        removeElement(arr , 3);
    }
}
