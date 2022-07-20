class Solution {
    
    boolean isSub(String s, String a){
        int i = 0, j = 0;
        while(i < s.length() && j < a.length()){
            if(s.charAt(i) == a.charAt(j)){
                j++;
            }
            i++;
        }
        return j >= a.length();
    }
    
    public int numMatchingSubseq(String s, String[] words) {
        int ans = 0;
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for(String w: words){
            if(set2.contains(w)) continue;
            if(set1.contains(w)) ans += 1;
            else {
                if(isSub(s,w)){
                    set1.add(w);
                    ans += 1;
                }
                else{
                    set2.add(w);
                }
            }
        }
        return ans;
    }
}