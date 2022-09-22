class Solution {
    public int divide(int dividend, int divisor) {
        
 // use long to avoid overflow
        long a = dividend;
        long b = divisor;
        int sign = 1;
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            sign = -1;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        long res = div(a, b);
        if (sign > 0) {
            return res > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) res;  // important point 
        }
        return (int) -res;     

    }
    static long div(long a, long b) {
        if (a < b) {
            return 0;
        }
        long count = 1;
        long tb = b;
        while ((tb + tb) <= a) {
            count = count + count;
            tb = tb + tb;
        }
        return count + div(a - tb, b);
    
        
    }
}