import java.util.Scanner;

public class linear_search{
    public static void main(String[] args) {
        int length = 10;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[length];

        for( int i = 0 ; i < length ; i++ ) arr[i] = i+1;

        System.out.print("Enter a number to search between 0 - " + length + " : ");
        int num = sc.nextInt();

        for( int i = 0 ; i <= num ; i++ ){
            if( arr[i] == num ) {
                System.out.println("Got it !!!");
                System.out.println("at index : " + i);
                break;
            }
        }
        sc.close();
    }
}
