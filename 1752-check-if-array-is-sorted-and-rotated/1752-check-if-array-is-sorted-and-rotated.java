class Solution {

    public boolean check(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[(i + 1) % a.length]) count++; // pretty standard observation
        }

        if (count > 1) return false;
        return true;
    }
}
