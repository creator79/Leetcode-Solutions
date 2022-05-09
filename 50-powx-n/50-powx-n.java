class Solution {
    public double myPow(double x, int n) {
        
        // using recusion
        
        if(n==0) return 1;
        if(n%2==0 && x<0){
            x=Math.abs(x);
        }
        if(n<0){
            n = n == Integer.MIN_VALUE ? Integer.MAX_VALUE : -1 * n;
            return myPow(1/x,n);
        }
        if(n%2==0){
            double l=myPow(x,n/2);
            return l*l;
        }
        else{
            double l=myPow(x,n/2);
            return l*l*x;
        }
    }
}