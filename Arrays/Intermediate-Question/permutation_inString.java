import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation_inString {
    public static List<Character> swapper(char arr[] , int swap , List<Character>permutation) {
        char a = arr[swap];
        arr[swap] = arr[swap+1];
        arr[swap+1] = a;
        for( int i = 0 ; i < arr.length ; i++ ){
            permutation.add(arr[i]);
        }
        return permutation;
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String p = s1;
        String s2 = "eidboadbacoo";
        char arr[] = s1.toCharArray();
        List<List<Character>> AllPermutations = new ArrayList<>();
        boolean flag = true;
        boolean ans = false;
        for( int i = 0 , swap = 0 ; flag ; i++ ){
            List<Character> permutations = new ArrayList<>();
            if( arr.length == 1 ) {
                permutations.add(arr[i]);
                AllPermutations.add(permutations);
                break;
            }
            if( swap + 1 == arr.length ) swap = 0;
            if( i == 0 ) {
                for( int j = 0 ; j < arr.length ; j++ ){
                    permutations.add(arr[j]);
                }
                AllPermutations.add(permutations);
            }else{
                AllPermutations.add(swapper(arr, swap, permutations));
            }
            if( new String(arr).equals(s1) && i != 0 ) flag = false;
            if( s2.contains(new String(arr)) ) {
                flag = false;
                ans = true;
            }
            swap++;
        }
        System.out.println(ans);
        // System.out.println(ans);
    }
}
