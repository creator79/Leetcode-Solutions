class Solution {
    public boolean detectCapitalUse(String str) {
         if(str.equals(str.toUpperCase())){
            return true;
        }
        // check string all char in lower case
        if(str.equals(str.toLowerCase())){
            return true;
        }
        // check string first char in upper case
        if(str.substring(0,1).equals(str.substring(0,1).toUpperCase())){
            if(str.substring(1).equals(str.substring(1).toLowerCase())){
                return true;
            }
        }
        return false;
    }
}