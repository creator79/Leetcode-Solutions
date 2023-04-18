class Solution {
    public String mergeAlternately(String s1, String s2) {
        int i = 0, j = 0;
        String merged = "";
        while (i < s1.length() && j < s2.length()) {
            merged += s1.charAt(i++);
            merged += s2.charAt(j++);
        }
        if (i < s1.length()) {
            merged += s1.substring(i);
        } else if (j < s2.length()) {
            merged += s2.substring(j);
        }
        return merged;
    }
}
