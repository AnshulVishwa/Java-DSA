public class regularExpressionMatching{
    public static boolean isMatch(String s, String p) {
        StringBuilder sb = new StringBuilder(p);
        boolean compareRes = true;
        for( int i = 0 ; i < s.length() ; i++ ){
            if ( s.charAt(i) == p.charAt(i) ) continue;
            else{
                if( p.charAt(i) == '.' ) continue;
                if( p.charAt(i) == '*' ){
                    char ch = p.charAt(i-1);
                    String add = "";
                    // int count = i;
                    System.out.println(ch);
                    System.out.println(p.charAt(i-1));
                    System.out.println(s.charAt(count));
                    for( int count = i ; p.charAt(i-1) != s.charAt(count) ; count++ ){
                        System.out.println("p.charAt(i-1) : "+p.charAt(i-1));
                        System.out.println("s.charAt(count)"+s.charAt(count));
                        System.out.println("count : " + count);
                    }

                    while( count != i ) {
                        count--;
                    }
                    p.replace("*", add);
                    // System.out.println(p);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "mississippi";
        String p = "mis*is*p*.";
        System.out.println(isMatch("mississippi" , "mis*is*p*."));
    }
}