class Solution {
    public int maxProfit(int[] prices) {
        int[] dp=new int[prices.length+1];
        for(int i=1;i<prices.length;i++){
            dp[i+1]=Math.max(dp[i],dp[i]+prices[i]-prices[i-1]);
        }
        return dp[dp.length-1];
        
    }
}
