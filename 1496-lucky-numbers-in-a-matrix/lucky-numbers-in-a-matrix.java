class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            int minCol=0;
            for(int j=1;j<m;j++){
                if(matrix[i][j]<matrix[i][minCol]){
                    minCol=j;
                }
            }
            boolean lucky=true;
            for(int k=0;k<n;k++){
                if(matrix[k][minCol]>matrix[i][minCol]){
                    lucky=false;
                    break;
                }
            }
            if(lucky){
                ans.add(matrix[i][minCol]);
            }
        }
        return ans;
    }
}