public class palindrome{
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int i = 0, j = str.length() - 1;
        if( str.length() <= 1 ) return true;
        if( x < 0 ) return false;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}
