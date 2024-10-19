public class x_pow_n {
    public static void main(String[] args) {
        double x = 3.2;
        int n = 4;

        double ans = 1;

        if( n < 0 ) {
            n = -n;
            x = 1/x;
        }

        while (n > 0) {
            if (n % 2 == 1) {
                ans *= x;
            }
            x *= x;
            n /= 2;
        }

        System.out.println(ans);
    }
}
