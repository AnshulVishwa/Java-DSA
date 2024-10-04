public class single_number {
    public static void main(String[] args) {
        int arr[] = {4,1,2,4,5,1,2};
        int xor = arr[0];
        for( int num : arr ){
            xor ^= num;
        }
        System.out.println(xor);
    }
}
