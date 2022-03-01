class Solution {
    public int[] countBits(int n) {
        //initilaising array with n+1 size
        int ans[]=new int[n+1];
        //number of set bits in zero is "0"
        ans[0]=0;
        
        for(int i=1;i<=n;i++){
            //if number is even,the answer is same as number of set bits in number/2 as it can be assumed as a left shift operation.For example, 4->0100 and 8->1000 (same number of bits but 4 is left shifted to make 8).
            if(i%2==0){
                ans[i]=ans[i/2];
            }
           // number of set bits in odd number is one more than number of set bits in previous even number.For example 4->0100(number of set bits=1) and 5->0110(number of set bits=2)
            else{
                ans[i]=ans[i-1]+1;
            }
            
        }
        
        return ans;
        
    }
}