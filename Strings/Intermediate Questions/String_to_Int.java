public class String_to_Int {
    public static int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        if( s.length() == 1 ) {
            if( Character.isDigit(s.charAt(0)) ) return Integer.parseInt(s);
            else return 0;
        }
        int i = 0;
        boolean isNegative = false;
        String result = "0";
        if (s.charAt(0) == '-') {
            isNegative = true;
            i++;
        } 
        else if (s.charAt(0) == '+') {
            i++;
        }
        while (i < s.length()) {
            String currentChar = Character.toString(s.charAt(i));
            if (!Character.isDigit(s.charAt(i))) break;
            result += s.charAt(i);
            i++;
        }
        if( result.equals("0") ) return 0;
        try {
            int temp = Integer.parseInt(result);
            return (isNegative) ? -temp : temp;
        } catch (NumberFormatException e) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("+1"));
        System.out.println(myAtoi("+-586"));
                System.out.println(myAtoi("3.655"));
                System.out.println(myAtoi("++1"));
    }
}