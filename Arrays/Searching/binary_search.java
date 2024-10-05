import java.util.Scanner;
public class binary_search{
    public static int Search_Number( int left , int right , int num , int arr[] ){
        int mid = left + ( right - left )/2;
        
        if( left > right ) return -1;

        if( num == arr[mid] ) return mid;

        else if( num > arr[mid] ) return Search_Number( mid + 1 , right, num, arr);
        
        else if( num < arr[mid] ) return Search_Number(left, mid - 1 , num, arr);
        
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int arr[] = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 7 , 8 , 8 , 9 };
        System.out.print("Enter the Number to search : ");
        int num = sc.nextInt();
        int index = Search_Number( 0 , arr.length - 1 , num , arr );
        System.out.println(index);
    }
}