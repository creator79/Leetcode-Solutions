class Solution {

    public int[] sortedSquares(int[] arr) {
        int[] squares = new int[arr.length];
        int l = 0, r = arr.length - 1, k = arr.length - 1;
        while (l <= r) {
            if (arr[l] * arr[l] <= arr[r] * arr[r]) {
                squares[k--] = arr[r] * arr[r];
                r--;
            } else {
                squares[k--] = arr[l] * arr[l];
                l++;
            }
        }
        return squares;
    }
}
