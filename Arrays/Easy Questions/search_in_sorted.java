public class search_in_sorted {
    public static int my_search( int arr[] , int left , int right , int target ){
        if( left > right ) return -1;
        int mid = (right-left)/2 + left;
        if( arr[mid] == target ) return mid;
        if( arr[mid] > target ) return my_search(arr, left, mid-1, target);
        return my_search(arr, mid+1, right, target);
    } 
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        
        System.out.println(my_search(arr , 0 , arr.length-1 , 6));

    }
}
 