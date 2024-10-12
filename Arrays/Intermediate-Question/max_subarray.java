public class max_subarray {
    public static int findMaxSubarray(int arr[]) {
        int maxSum = Integer.MIN_VALUE , curr_sum = 0;

        for( int start = 0 ; start < arr.length ; start++ ){
            curr_sum += arr[start];
            maxSum = Math.max(maxSum, curr_sum);
            if( curr_sum < 0 ) curr_sum = 0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 4 , -9  };
        findMaxSubarray(arr);
    }
}
