class Solution {
    public int addDigits(int num) {
        int n=num;
        
        
       /* for(int i=0;i<m;i++){
            int n=nums[];
        while(n!=0){
            n=n%10;
            count++;
        }*/
        if(num<10){
            return n;
        }
        while(num>9){
            int sum=0;
            int val=num;
        while(val!=0){
            int rem=val%10;
            sum+=rem;
            val/=10;
        }
            num=sum;
        }
        return num;
   
    }
}