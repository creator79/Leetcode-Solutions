class Solution {
    public boolean isHappy(int n) {
        
// apoorach of slow and fast pointer used in LL
        int slow=n;
        int fast=n;
        do{
//    Move by slow pointer means square only one times          
            slow=findSquare(slow);
//     Move by fast pointer  means square the number two times         
            fast=findSquare(findSquare(fast));
            
        }while(slow!=fast);
            if(slow==1){ // while  numbers for which this process ends in 1 are happy.
                return true;
            }
        
        return false;     
    }
//     Find the square digit by digit
    private int findSquare(int num){
        int ans=0;
        while(num>0){
            int rem = num%10;
            ans+= rem*rem;
            num/=10;
            
        }
        return ans;
    }
}