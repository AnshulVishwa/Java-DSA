// To develop a program to print all the values whose index is prime in an array
public class prime_index {
    public static void main(String[] args) {
        int arr[] = {1,5,8,5,8,5,9,6,2,3,5};
        for( int j = 1 ; j < arr.length ; j++ ){
            int half = j/2;
            boolean flag = false;
            for( int i = 2 ; i <= half ; i++ ){
                if( j%i == 0 ) {
                    flag = true;
                    break;
                }
            }
            if( !flag ) System.out.println("Prime Value : " + arr[j]);
        }
    }
}