class Solution {

    public int mySqrt(int x) {
        if (x == 0) return 0;
        int start = 1; // just handle two base case 0 and 1
        int end = x;
        int ans = 0;
        while (start <= end) { // we use simple binary search here
            int mid = start + (end - start) / 2;
            if (mid <= x / mid) {
                start = mid + 1;
                ans = mid;
            } else end = mid - 1;
        }
        return ans;
    }
}
