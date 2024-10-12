public class product_Array_exceptSelf{
    public static int[] productExceptSelf(int[] nums) {
        int avoid = 0;
        int new_arr[] = new int[nums.length];
        while ( avoid != nums.length ) {
            int currProd = 1;
            for( int i = 0 ; i < nums.length ; i++ ){
                if( nums[i] == nums[avoid] ) continue;
                currProd *= nums[i];
            }
            System.out.println(currProd);
            new_arr[avoid] = currProd;
            avoid++;
        }
        return new_arr;
    }
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 3 , 4 };
        productExceptSelf( arr );
    } 
}