class Solution {
public String decodeMessage(String key, String message) {
    HashMap<Character, Character> map = new HashMap<>();
    List<Character> tempChar = new ArrayList<>();
    Character c = 'a';
    for(int i = 0; i < key.length(); i++) {
        if(key.charAt(i) != ' ') {
            if(!tempChar.contains(key.charAt(i))) {
                map.put(key.charAt(i), c++);
                tempChar.add(key.charAt(i));
            }
        }
    }
    String res = "";
    for(int i = 0; i < message.length(); i++) {
        if(message.charAt(i) == ' ') {
            res += " ";
        } else {
            res += map.get(message.charAt(i));
        }
    }
    return res;
}
}