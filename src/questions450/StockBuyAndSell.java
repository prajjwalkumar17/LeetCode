package questions450;

public class StockBuyAndSell {


    public static int profitEfficient(int[] arr) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i])
                profit += arr[i] - arr[i - 1];
        }
        return profit;
    }


    //LeetCode
    private static int stockBuyandSellInOneDay(int[] prices) {
        int overallProfit = 0;
        int leastPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            leastPrice = Math.min(leastPrice, price);
            overallProfit = Math.max(overallProfit, price - leastPrice);
        }
        return overallProfit;
    }

    public static int profitNaive(int[] arr, int start, int end) {
        if (end <= start) return 0;
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] < arr[j]) {
                    int currProfit = arr[j] - arr[i]
                            + profitNaive(arr, start, i - 1)
                            + profitNaive(arr, j + 1, end);
                    profit = Math.max(profit, currProfit);
                }
            }
        }
        return profit;
    }


}
