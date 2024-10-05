public class search_insert_index {
    public static void main(String[] args) {
        int nums[] = {0,3,4,8};
        int target = 2;
        for( int i = 0 ; i < nums.length ; i++ ){
            if( target == nums[i] ) {
                System.out.println(i);
                break;
            }
            if( target < nums[i] ) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(nums.length);
    }
}
