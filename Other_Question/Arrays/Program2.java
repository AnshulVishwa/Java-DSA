// To implement a program that can insert, delete, and edit an element in array

public class Program2 {
        public static void main(String[] args) {
            int arr[] = new int[2];
            insert(arr, 10);
            insert(arr, 20);
            for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");
            edit(arr, 0, 50);
            System.out.println();
            for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");
            delete(arr, 0);
            System.out.println();
            for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");

        }   
        public static void insert(int arr[] , int data) {
            for( int i = 0 ; i < arr.length-1 ; i++ ){
                if( arr[i] == 0 && arr[i+1] == 0 ){
                    arr[i] = data;
                    return;
                }
            }
            arr[arr.length-1] = ( arr[arr.length-1] == 0 ) ? data : arr[arr.length-1];
        }
        public static void delete( int arr[] , int index ) {
            if( index == arr.length-1 ) {
                arr[index] = 0;
                return;
            }
            else{
                for( int i = index ; i < arr.length-1 ; i++ ){
                    arr[i] = arr[i+1];
                }
                arr[arr.length-1] = 0;
                return;
            }
        }
        public static void edit( int arr[] , int index , int data ) {
            arr[index] = data;
        }
}
