public class separate_balls {
    public static long minimumSteps(String s) {
        long steps = 0;
        StringBuilder sb = new StringBuilder(s);
        int black = 0;
        int white = 1;
        
        while (black < sb.length() && white < sb.length()) {
            if (sb.charAt(black) == '1' && sb.charAt(white) == '0') {
                sb.setCharAt(black, '0');
                sb.setCharAt(white, '1');
                black++;
                white++;
                steps++;
            } else {
                white++;
            }
            
            if (white >= sb.length() && black < sb.length() - 1) {
                black++;
                white = black + 1;
            }
        }
        
        System.out.println(sb);
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(minimumSteps("101"));  // Example test case
    }
}
