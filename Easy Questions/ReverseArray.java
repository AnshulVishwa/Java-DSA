public class ReverseArray {
    public static void main( String args[] ){
        int arr[] = {2 , 12 , 22 , 32 , 42};
        int reverse[] = new int [arr.length];
        for( int x=arr.length-1, y=0 ; x >= 0 && y < arr.length ; x--, y++ ){
            reverse[x] = arr[y];
        }
        for(int i = 0 ; i < reverse.length ; i++){
            System.out.println(reverse[i]);
        }
    }
}