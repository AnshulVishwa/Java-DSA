public class subarray {
    public static int form_subarray( int arr[] , int start , int last ){
        int max = 0;
        for( int i = last-1 ; i >= start ; i-- ){
            int sum = 0;
            for( int j = start ; j < i ; j++ ){
                sum += arr[j];
            }
            if( max < sum ) max = sum;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { 2 , 5 , -7 , 8 , 6 , -5 }; 
        int max = form_subarray( arr , 0 , arr.length );
        System.out.println("max : " + max);
    }
}