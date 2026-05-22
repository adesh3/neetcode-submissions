class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        if(n<2)
            return 0;
        int buy = prices[0];
        for(int i = 1; i< n; i++) {
            if(prices[i]< buy)
                buy = prices[i];
            else {
                ans = Math.max(ans,  prices[i] -buy );
            }
        }
        return ans;
    }
}
