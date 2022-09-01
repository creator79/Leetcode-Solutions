class Solution {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            } else if (map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }

        // Checks if the values have duplicates or not. This indicates many to one mappings.
        Set<Character> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}
