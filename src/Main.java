public class Main {


    public static void main(String[] args) {

        int[] num1 = new int[]{7, 1, 5, 3, 6, 4};

        System.out.println(stockBuyandSellInOneDay(num1));


    }

    private static int stockBuyandSellEff(int[] num1) {
        int profit = 0;
        for (int i = 1; i < num1.length; i++) {
            if (num1[i] > num1[i - 1])
                profit += num1[i] - num1[i - 1];
        }
        return profit;
    }

    private static int stockBuyandSellInOneDay(int[] prices) {
        int overallProfit = 0;
        int leastPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            leastPrice = Math.min(leastPrice, price);
            overallProfit = Math.max(overallProfit, price - leastPrice);
        }
        return overallProfit;
    }

    public static void printArray(int[] nums) {
        for (long i : nums) {
            System.out.println(i);

        }
    }
}