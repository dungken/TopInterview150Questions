package arraystring;

public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                int profit = prices[i] - prices[i - 1];
                max += profit;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
