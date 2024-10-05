import java.util.Scanner;

public class search_in_sorted {
    public static void main(String[] args) {
        int arr[] = new int[10];

        for( int i = 0 ; i < arr.length ; i++ ) arr[i] = (int)(i+1);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search : ");
        int search = sc.nextInt();
        int a = search;
        for( int i = 0 ; i < arr.length ; i++ ){
            if( arr[i] == search ) search = i;
        }
        if ( a == search ) System.out.println("This number is not available");
        else System.out.println("Available at index " + search);
    }
}
 