class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans=0;
        int low=1;
        int high=0;
        for(int val:piles){
            high=Math.max(high,val);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean possible(int[] nums, int mid,int hours){
        long total=0;
        for(int val:nums){
            total+=(long) Math.ceil((double) val/(double) mid);
        }
        return total<=hours;
    }
}