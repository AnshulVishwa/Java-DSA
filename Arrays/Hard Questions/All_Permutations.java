import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class All_Permutations {
    public static List<Integer> swapper( int []arr , int swap , List<Integer> permutation ) {
        int a = arr[swap];
        arr[swap] = arr[swap+1];
        arr[swap+1] = a;
        for( int i = 0 ; i < arr.length ; i++ ){
            permutation.add(arr[i]);
        }
        return permutation;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int arr[] = Arrays.copyOf(nums, nums.length);
        List<List<Integer>> AllPermutations = new ArrayList<>();
        boolean flag = true;
        for( int i = 0 , swap = 0 ; flag ; i++ ){
            List<Integer> permutations = new ArrayList<>();
            if( nums.length == 1 ) {
                permutations.add(nums[i]);
                AllPermutations.add(permutations);
                break;
            }
            if( swap + 1 == nums.length ) swap = 0;
            if( i == 0 ) {
                for( int j = 0 ; j < nums.length ; j++ ){
                    permutations.add(nums[j]);
                }
                AllPermutations.add(permutations);
            }else{
                AllPermutations.add(swapper(nums, swap, permutations));
            }
            if( Arrays.equals(nums, arr) && i != 0 ) flag = false;
            swap++;
        }
        for( List<Integer> outerList : AllPermutations ){
            for( Integer innerList : outerList ){
                System.out.print(innerList + "\t");
            }
            System.out.println();
        }
    }
}
