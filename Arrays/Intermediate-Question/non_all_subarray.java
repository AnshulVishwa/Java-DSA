// Non Optimized Program
public class non_all_subarray {
    public static void main(String[] args) {
        int arr[] = { 0 , 1 , 2 , 3 , 4 , 5 };
        for( int start = 0 ; start < arr.length ; start++ ){
            for( int end = start ; end < arr.length ; end++ ){
                for( int i = start ; i <= end ; i++ ){
                    System.out.print(arr[i]);
                }
                System.out.print( "  " );
            }
            System.out.println();
        }
    }
}
