public class Program1 {
    public static void main(String[] args) {
        int arr[] = { 1 , 5 , 7 , 9 , 10 , 0 };
        System.out.println("\nAverage of the array is : " + AVG(arr) );
    }
    public static double AVG( int arr[] ){
        double sum = 0;
        for( int a : arr ) sum += a;
        sum = sum/arr.length;
        return sum;
    }
}