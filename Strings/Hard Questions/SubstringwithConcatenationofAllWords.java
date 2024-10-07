import java.util.List;
import java.util.ArrayList;

public class SubstringwithConcatenationofAllWords {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<>();
        for( int i = 0 ; i < words.length ; i++ ){
            String thisString = "";
            int start = i;
            int end = ( i == 0 ) ? words.length : i;
            do{
                thisString += words[start];
                start++;
                if( start == words.length && i != 0 ) start = 0;
            }
            while( start != end );
            if( s.contains(thisString) ){
                answer.add(s.indexOf(thisString));
                s.replaceFirst(s, thisString);
            }
        }
        int i = 1;
        for (Integer num : answer) {
            System.out.println(i + " -> " + num);
            i++;
        }
        // System.out.println(answer.size());
        return answer;
    }
    public static void main(String[] args) {
        String arr[] = {"foo","bar"};
        List<Integer> finalAns = findSubstring("barfoothefoobarman", arr);
    }
}
