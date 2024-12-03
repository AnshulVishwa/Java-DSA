public class best_time_BuySell {
    public static int maxProfit(int[] prices) {
        if( prices.length == 0 ) return 0;
        if( prices.length == 1 ) return 0;
        if( prices.length == 2 ) return Math.max( prices[0]-prices[1] , prices[1]-prices[0] );

        int min = prices[0];
        int max = 0;
        for( int i = 0 ; i < prices.length ; i++ ){
            if( prices[i] < min ) min = prices[i];
            if( prices[i]-min > max ) max = prices[i]-min;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { 1 , 4 , 0 , 9};
        int profit = maxProfit( arr );
        System.out.println("profit -> " + profit);
    }
}
