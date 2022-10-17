class Solution {

    public boolean checkIfPangram(String s) {
//         here i make a string of hashset rather than character so we use empty string
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i) + "");
        }
        if (hs.size() == 26) {
            return true;
        }
        return false;
    }
}
