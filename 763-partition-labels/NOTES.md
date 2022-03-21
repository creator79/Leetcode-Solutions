Thus, we add these values to our ArrayList of let's say result & return them i.e. [9, 7, 8]
​
I hope ladies - n - gentlemen approach is absolute clear, Let's code it up,
​
Java
​
class Solution {
public List<Integer> partitionLabels(String s) {
Map<Character, Integer> map = new HashMap<>();
// filling impact of character's
for(int i = 0; i < s.length(); i++){
char ch = s.charAt(i);
map.put(ch, i);
}
// making of result
List<Integer> res = new ArrayList<>();
int prev = -1;
int max = 0;
for(int i = 0; i < s.length(); i++){
char ch = s.charAt(i);
max = Math.max(max, map.get(ch));
if(max == i){
// partition time
res.add(max - prev);
prev = max;
}
}
return res;
}
}