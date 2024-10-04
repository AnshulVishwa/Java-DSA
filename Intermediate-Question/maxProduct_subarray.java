public class maxProduct_subarray {
    public static void main(String[] args) {

        int nums[] = {-2,0,1,5,-9};
        // if( nums.length == 1 ) return nums[0];
        int currentProd = nums[0];
        int maxprod = nums[0];
        int minprod = nums[0];
        for( int i = 1 ; i < nums.length ; i++ ){
            if( nums[i] < 0 ){
                int temp = currentProd;
                currentProd = minprod;
                minprod = temp;
            }
            currentProd = Math.max( nums[i] , nums[i]*currentProd );
            minprod = Math.min( nums[i] , nums[i]*minprod );
            maxprod = Math.max( currentProd , maxprod );
        }
        System.out.println(maxprod);
    }
}
