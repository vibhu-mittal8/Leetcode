class Solution {
    public int[] sortedSquares(int[] nums) {
      /*  int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];

        }
        Arrays.sort(nums);
        return nums;*/
        int n=nums.length;
        int[] temp=new int[n];
        int low=0;
        int high=n-1;
        while(low<=high){
            int leftV=nums[low]*nums[low];
            int rightV=nums[high]*nums[high];
            if(leftV>rightV){
                temp[n-1]=leftV;
                low++;
                n--;
            }else{
                temp[n-1]=rightV;
                n--;
                high--;
            }
        }
        return temp;
        
    }
}