public class buy_sell_II {
    public static int maxProfit(int[] prices) {
        if( prices.length == 0 ) return 0;
        if( prices.length == 1 ) return 0;
        if( prices.length == 2 ) return Math.max(prices[1]-prices[0] , 0);
        
        int profit = 0;
        int i = 0;
        while ( i < prices.length-2 ) {
            if( prices[i] < prices[i+1] ) profit += prices[i+1]-prices[i];
            i++;
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] = { 7 , 5 , 1 , 2 , 6 , 3 };
        System.out.println(maxProfit(arr));
    }
}
