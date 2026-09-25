class Solution {
    public int findNumbers(int[] nums) {
      /*  int ans=0;
        int m=nums.length;
        
        
        for (int i=0;i<m;i++){
            int count=0;
            
            int n=nums[i];
            while(n!=0){
                n=n/10;
                count++;
            }
            if(count%2==0){
                ans++;
            }
        }
        return ans;*/
        int ans=0;
        for(int val:nums){
            String str=String.valueOf(val);
            if(str.length()%2==0){
                ans++;
            }
        }
        return ans;
        
    }
}