class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() <= 1 || goal.length() <= 1 || s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            HashMap<Character, Integer> charCount = new HashMap<>();
            for (char c : s.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            for (int count : charCount.values()) {
                if (count > 1) {
                    return true;
                }
            }
            return false;
        } else {
            HashMap<Character, Integer> sCharCount = new HashMap<>();
            HashMap<Character, Integer> goalCharCount = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char goalChar = goal.charAt(i);

                sCharCount.put(sChar, sCharCount.getOrDefault(sChar, 0) + 1);
                goalCharCount.put(goalChar, goalCharCount.getOrDefault(goalChar, 0) + 1);
            }

            int mismatchCount = 0;
            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char goalChar = goal.charAt(i);

                if (sChar != goalChar) {
                    mismatchCount++;
                    if (sCharCount.get(sChar) != goalCharCount.get(sChar)) {
                        return false;
                    }
                }
            }

            return mismatchCount == 2;
        }
    }
}