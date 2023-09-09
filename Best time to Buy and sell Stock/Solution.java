class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minval=prices[0];
        for(int i=0;i<prices.length;i++){
            maxprofit=Math.max(maxprofit,prices[i]-minval);
            minval=Math.min(minval,prices[i]);
        }
        return maxprofit;
    }
}
