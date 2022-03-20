class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String prev = countAndSay(n-1);
        StringBuilder curr = new StringBuilder();
        int count = 1;
        char ch = prev.charAt(0);
        for(int i = 1; i < prev.length(); i++){
            if(ch == prev.charAt(i)){
                count++;
            }
            else{
                curr.append(count).append(ch);
                count = 1;
                ch = prev.charAt(i);
            }
        }
        curr.append(count).append(ch);
        return curr.toString();
    }
}