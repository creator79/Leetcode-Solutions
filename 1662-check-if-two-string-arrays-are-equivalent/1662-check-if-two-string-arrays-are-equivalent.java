class Solution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "", s2 = "";
        for (int i = 0; i < word1.length; i++) {
            s1 += word1[i];
        }
        for (int j = 0; j < word2.length; j++) {
            s2 += word2[j];
        }

        if (s1.equals(s2)) return true;
        return false;
    }
}
