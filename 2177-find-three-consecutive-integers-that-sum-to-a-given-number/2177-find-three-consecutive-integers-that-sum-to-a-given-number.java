class Solution {
   //for Three Consecutive Integers let middle numbers is mid so target = ((mid-1)+(mid)+(mid+1)) = mid*3
    public long[] sumOfThree(long num) {
        if(num % 3 != 0)return new long[0];
        return new long[]{num/3-1, num/3, num/3+1};
    }
}