// Not Optimized Approach
import java.util.List;
import java.util.ArrayList;

public class Sum3 {
    public static List<List<Integer>> func(int []nums , List<List<Integer>>finalList) {
        if( nums.length < 3 ) return finalList;
        if( nums.length == 3 ) {
            if( nums[0]+nums[1]+nums[2] == 0 ){
                List<Integer> triplets = new ArrayList<>();
                triplets.add(nums[0]);
                triplets.add(nums[1]);
                triplets.add(nums[2]);
                return finalList;
            }
        }
        for( int i = 0 ; i < nums.length ; i++ ){
            for( int j = 0 ; j < nums.length ; j++ ){
                for( int k = 0 ; k < nums.length ; k++ ){
                    if( i != j && j != k && i != k ){
                        if( nums[i]+nums[j]+nums[k] == 0 ){
                            List<Integer> triplets = new ArrayList<>();
                            triplets.add(nums[i]);
                            triplets.add(nums[j]);
                            triplets.add(nums[k]);
                            java.util.Collections.sort(triplets);
                            if( !finalList.contains(triplets) ){
                                finalList.add(triplets);
                            }
                        }
                    }
                }
            }
        } 
        return finalList;
    }
    public static void main(String[] args) {
        List<List<Integer>> finalList = new ArrayList<>();
        int nums[] = {-1,0,1,2,-1,-4};
        finalList = func(nums, finalList);
        for( List<Integer> outerList : finalList ){
            for( Integer i : outerList ){
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
