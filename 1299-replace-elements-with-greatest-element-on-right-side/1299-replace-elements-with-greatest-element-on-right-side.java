class Solution {

    public int[] replaceElements(int[] arr) {
        int gtr = -1, temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = gtr;
            gtr = Math.max(gtr, temp);
        }

        return arr;
    }
}
