public class missing_repeating {
    public static int[] check_missing( int arr[] , int difference , int change ){
        String say = "";
        for( int i = 0 ; i < arr.length - 1 ; i++ ){
            arr[i] = arr[i+1] - arr[i];
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 4 , 8 , 16 , 20 };

        arr = check_missing( arr , 0 , 0 );
        System.out.println("difference  : "  + arr[0]);
        System.out.println("change : " + arr[1]);
    }
}