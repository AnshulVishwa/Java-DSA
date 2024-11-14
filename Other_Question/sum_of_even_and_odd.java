public class sum_of_even_and_odd {
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        int even_sum = calSum(arr)[0];
        int odd_sum = calSum(arr)[1];
        System.out.println(even_sum);
        System.out.println(odd_sum);
    }
    public static int[] calSum(int arr[]) {
        int even_sum = 0;
        int odd_sum = 0;
        for( int i = 0 ; i < arr.length ; i++ ){
            if( arr[i] % 2 == 0 ) even_sum += arr[i];
            else odd_sum += arr[i];
        }
        int result[] = { even_sum , odd_sum };
        return result; 
    }
}
