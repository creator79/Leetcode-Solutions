class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        
       List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String str : s){
            char [] ch = str.toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);
            if(!map.containsKey(temp)){
                map.put(temp,new ArrayList<>());
            }
            map.get(temp).add(str);
        }
        for(String key : map.keySet()){
            result.add(map.get(key));
        }
        return result;
        
        
        
        
    }
}