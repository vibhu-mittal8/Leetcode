class Solution {
    public int maxArea(int[] height) {
        int ans=Integer.MIN_VALUE;
        int low=0;
        int high=height.length-1;
        
                while(low<high){
                    int lH=height[low];
                    int rH=height[high];
                    int min=Math.min(lH,rH);
                    ans=Math.max(ans,min*(high-low));
                    if(lH<rH){
                        low++;
                    }
                    else{
                        high--;
                    }

                }       
        return ans;
    }
}