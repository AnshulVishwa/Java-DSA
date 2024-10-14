public class isAnagram {
    public static boolean isAnagram(String s, String t) {
        for( int i = 0 ; i < s.length() ; i++ ){
            if( !s.contains(Character.toString(t.charAt(i))) ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anshul", "luhsna"));
    }
}
