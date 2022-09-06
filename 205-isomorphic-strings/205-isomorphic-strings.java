class Solution {
    // In this problem, we have to determine whether the given pair of strings is isomorphic or not. To solve this, we will use two hashmaps. First hashmap of character vs character; will store the unique characters of S1 and the first corresponding unique character of S2. Whereas the second hashmap of character vs Boolean will mark the use of character of S2 as true after this character has been mapped and stored in the first hashmap. Whenever the character, which is already present in the first hashmap, occurs in the S1 again, then you need to check if the character corresponding to the character this time is the same as the character which occurred previously. And if they are the same then move to the next character of S1, otherwise return false. And whenever a new character appears in S1, check to see if the character matching to that character exists in the second hashmap; if it does, the rule has been broken, therefore return false. If the character isn't in the second hashmap, create a new key in the first hashmap (new character of S1, new character of S2). Watch this part of the video for a better understanding of this section.

   public  boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map1 = new HashMap<Character, Character>();
		HashMap<Character, Character> map2 = new HashMap<Character, Character>();
		for(int i = 0 ; i < s.length() ;i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			if(!map1.containsKey(ch1)) {
				map1.put(ch1, ch2);
			}else {
				if(map1.get(ch1) != ch2) {
					return false;
				}
			}
		}
		for(int i = 0 ; i < t.length() ;i++) {
			char ch1 = t.charAt(i);
			char ch2 = s.charAt(i);
			if(!map2.containsKey(ch1)) {
				map2.put(ch1, ch2);
			}else {
				if(map2.get(ch1) != ch2) {
					return false;
				}
			}
		}
		return true;
	}
 
}
