class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        
        String[] result = new String[names.length];
        
        TreeMap< Integer,String> mp = new TreeMap<>(Collections.reverseOrder());
        
        for(int i=0;i<names.length;i++){
            mp.put(heights[i],names[i]);
        }
        int i=0;
        for(int s:mp.keySet())
        {
            result[i++]= mp.get(s);
        }  
        return result;
    }
}