class Solution{
public boolean checkAnagram(String s, String t)
    {
        HashMap<Character,Integer> hs = new HashMap<>(); 
        HashMap<Character, Integer> h = new HashMap<>();
        if(s.length() > t.length()) 
        {
             return false;
        }
        for(Character ch: s.toCharArray()) 
        {
				hs.put(ch, hs.getOrDefault(ch,0) + 1); 
        }
        
        for(Character c: t.toCharArray()) 
        {
            h.put(c,h.getOrDefault(c,0) +1);
        }
        if(h.equals(hs) == true) 
        {
            return true;
        }
        return false;
    }
    
    public List<String> removeAnagrams(String[] words) 
    {
        List<String> res = new ArrayList<>();
        String prev = "";

        for(int i = 0;i<words.length;i++)
        {
            if(checkAnagram(words[i], prev) == false)
            {
                res.add(words[i]);
                prev = words[i];
            }
        }
        return res;
         
    }
}