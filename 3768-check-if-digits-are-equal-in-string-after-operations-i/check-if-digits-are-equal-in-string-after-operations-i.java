class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            String res = ""; 

            for (int i = 0; i < s.length() - 1; i++) {
                int c = (Character.getNumericValue(s.charAt(i)) + Character.getNumericValue(s.charAt(i + 1))) % 10;
                res += c;
            }
            s = res;
        }

        return s.length() == 2 && s.charAt(0) == s.charAt(1);

    }

}