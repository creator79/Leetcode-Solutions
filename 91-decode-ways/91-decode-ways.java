class Solution {

    public int numDecodings(String s) {
        // Nice Apporach by Shipra 
        int t = 0, one = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            int temp = one;
            if (s.charAt(i) == '0') one = 0;
            if (i < s.length() - 1 && (s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i + 1) < '7')) one += t;
            t = temp;
        }
        return one;
    }
}
