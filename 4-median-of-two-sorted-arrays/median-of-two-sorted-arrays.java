class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] ans = new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i++];
            }else{
                ans[k++]=nums2[j++];
            }
        }
        while(i<n1){
            ans[k++]=nums1[i++];
        }
        while(j<n2){
            ans[k++]=nums2[j++];
        }
        int n=n1+n2;
        if(n%2==1){
            return (double)ans[n/2];
        }
        return (double) (ans[n/2]+ans[n/2-1])/2.0;
    }
}