class Solution {
    public int maxProfit(int[] prices) {
     int buy=Integer.MAX_VALUE;
     int ans=0;
     for(int val:prices){
        if(val<buy){
            buy=val;
        }
        ans=Math.max(ans,val-buy);
     }   
        return ans;
    }
}