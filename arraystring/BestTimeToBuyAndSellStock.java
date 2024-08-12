package arraystring;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            int profit = prices[i] - buy;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1/**/};
        System.out.println(maxProfit(prices));
    }
}
