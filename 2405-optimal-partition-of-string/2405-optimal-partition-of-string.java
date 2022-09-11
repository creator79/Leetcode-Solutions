class Solution {
//     Explanation
// When traversing through the string, we keep record of characters in current substring, if a character gets repeated it means we need to partition the string at that position and we now have to consider new substring starting from that position.

// We use a set to keep record of characters present in our current substring, if we encounter a repeated character, we increment the ans and start fresh with an empty set.
    public int partitionString(String s) {
        
        // Brute force is submitted in contest 
        // Good apporach by Shivangi 
        
        int ans = 1;
        HashSet<Character> st = new HashSet<>();
        for(int i=0;i<s.length();i++){
 		  // Insert Till we find duplicate element.
            if(!st.contains(s.charAt(i))){
                st.add(s.charAt(i));
            }
            else{
			 // If we found duplicate char then increment count and clear set and start with new set.
                ans++;
                st.clear();
                st.add(s.charAt(i));
            }
        }
        return ans;
    }
}

    