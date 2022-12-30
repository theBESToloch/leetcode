package easy_121;

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int length = prices.length;
        if (length < 2) return 0;

        int min = prices[0];

        int i = 1;
        int sign = prices[0] > prices[1] ? 0 : 1; // 1 - возрастает, 0 - убывает
        while (i < length) {

            if (prices[i] > prices[i - 1]) {
                if (sign == 0) {
                    if (prices[i - 1] < min) min = prices[i - 1];
                }
                sign = 1;
            } else if (prices[i] < prices[i - 1]) {
                if (sign == 1) {
                    if (prices[i - 1] - min > maxProfit) {
                        maxProfit = prices[i - 1] - min;
                    }
                }
                sign = 0;
            }
            i++;
        }
        return Math.max(prices[length - 1] - min, maxProfit);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int profit = solution.maxProfit(new int[]{10, 9, 8, 7, 8, 7, 8, 9, 11, 12, 10, 9, 5, 6, 5, 6, 11});
        System.out.println(profit);
    }
}