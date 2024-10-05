// package Sorting;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 100 , 4 , 8 , 800 , 9 , 50 , 6 , 2};
        // Everytime i will be reduced because everytime we push the biggest element to last so no need to sort the last index's element 
        System.out.println("length of array is " + arr.length);
        for( int i = arr.length - 1 ; i >= 0 ; i-- ){
            System.out.println("i = " + i);
            boolean say = false;
            for( int j = 0 ; j < i ; j++ ){
                if( arr[ j ] < arr[ j + 1 ] ) {
                    say = false;
                    continue;
                }
                else{
                    int a = arr[j];
                    arr[ j ] = arr[ j + 1 ];
                    arr[ j + 1 ] = a;
                    say = true;
                }
            }
            if( !say ) break;
        }
        // Show Array
        for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");
    }
}