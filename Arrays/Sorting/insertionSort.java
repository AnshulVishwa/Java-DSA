public class insertionSort {
    public static void main(String[] args) {
        int arr[] = { 5 , 1 , 8 , 7 , 9 , 3 };
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + " \t");
    }
}
