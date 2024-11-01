public class single_element_sortedArray {
    public static int singleNonDuplicate(int[] nums) {
        if( nums.length%2 == 0 ) return 0;
        if( nums.length == 1 ) return nums[0];
        int i = 0;
        int j = nums.length-1;
        while( i < j ){
            if( nums[i] != nums[i+1] ) return nums[i];
            if( nums[j] != nums[j-1] ) return nums[j];
            int mid = i + ( j - i )/2;
            if( nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1] ) return nums[mid];
            j -= 2;
            i += 2;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = { 1 , 1 , 2 };
        System.out.println(singleNonDuplicate(arr));
    }
}
