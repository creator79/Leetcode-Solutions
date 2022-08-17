class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<words.length;i++){
            String s = "";
            for(int j=0;j<words[i].length();j++){
                s = s+ arr[words[i].charAt(j)-97];
            }
            hs.add(s);
        }
        return hs.size();
    }
}