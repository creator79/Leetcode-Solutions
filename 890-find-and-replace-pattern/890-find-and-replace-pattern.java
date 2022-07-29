// Note that we need to verify the mapping is correct from both directions between the 2 strings we are comparing to ensure injectivity. Surjectivity is guaranteed both ways by verifying they strings have the same length, since the mapping is based on position of the characters in the 2 target strings to compare.

class Solution {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (match(word, pattern)) res.add(word);
        }
        return res;
    }

    private boolean match(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Character> dict1 = new HashMap<>();
        Map<Character, Character> dict2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (dict1.containsKey(c1)) {
                if (dict1.get(c1) != c2) return false;
            } else dict1.put(c1, c2);
            if (dict2.containsKey(c2)) {
                if (dict2.get(c2) != c1) return false;
            } else dict2.put(c2, c1);
        }
        return true;
    }
}
