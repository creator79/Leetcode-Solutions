class Solution {
//     its is slightly better apporach than creating another function of checking anagram using hashmap.
    public List<String> removeAnagrams(String[] words) {
         List<String> ans = new ArrayList<>();
        String temp = "";
        for (String s: words){
            char[] carr = s.toCharArray();
            Arrays.sort(carr);
            String curr = new String(carr);
            if (!curr.equals(temp))
                ans.add(s);
            temp = curr;
        }
        return ans;

    }
}