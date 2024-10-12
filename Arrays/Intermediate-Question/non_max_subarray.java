public class non_max_subarray {
    public static void main(String[] args) {
        int arr[] = { 5, 4, -1, 7, 8 };
        int maxSum = Integer.MIN_VALUE;
        for( int start = 0 ; start < arr.length ; start++ ){
            int curr_sum = 0;
            for( int end = start ; end < arr.length ; end++ ){
                curr_sum += arr[end];
                maxSum = Math.max( curr_sum , maxSum );     
            }
        }
        System.out.println(maxSum);
    }
}
