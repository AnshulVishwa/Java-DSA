public class length_lastWord{
    public static int lengthOfLastWord(String s) {
        if( s.length() == 0 ) return 0;
        if( s.length() == 1 ) return 1;
        int len = 0;
        int last = s.length();
        boolean stopJ = false;
        for( int i = 0 , j = s.length()-1 ; i < last && j >= 0 ; i++ ){
            if( s.charAt(j) == ' ' && !stopJ ) last--;
            else if( s.charAt(j) != ' ' ) stopJ = true;
            if( s.charAt(i) == ' ' && i != s.length()-1 ) len = 0;
            else len++;
            j--;
        }
        return len;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy   "));
    }
}