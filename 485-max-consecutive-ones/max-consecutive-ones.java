class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int ans=0;
        for(int val:nums){
            if(val==0){
                count=0;
            }else{
                count++;
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}