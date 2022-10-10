class Solution {
    /** Algorithm
        1. FastFail: if length == 1, return ""
        2. You have two possibilities:
            a). Normal palindrome: "abba". In this case, traverse from 0 until half and try to change the first char that is > a into a. So abba => aaba.
            b). If a) did not work, it means you are in the edge case of "a...a" palindrome. This means you need to change the last a into b => "a...a" => "a....ab"
    */
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1) {
            return "";
        }
        char[] chars = palindrome.toCharArray();
        if(!canBreak(chars)) {
            chars[chars.length -1] = 'b';
        }
        return new String(chars);
    }
    
    private boolean canBreak(char[] chars) {
        for (int i = 0; i < chars.length /2; i++) {
            if (chars[i] > 'a') {
                chars[i] = 'a';
                return true;
            }
        }
        return false;
    }
}