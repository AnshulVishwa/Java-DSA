public class subarray_sum_divisibleK {
    public static void main(String[] args) {
        int arr[] = { -1 , 9 , 8 , 2 , -9 , 1 };
        int k = 2;
        int currSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
        
            if (currSum % k == 0 && currSum > maxSum) {
                maxSum = currSum;
            }
            
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
