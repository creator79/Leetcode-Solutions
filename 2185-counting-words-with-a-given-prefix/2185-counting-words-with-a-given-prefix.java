class Solution {
    public int prefixCount(String[] words, String pref) {
//       Solution with startWith Function
        // int res = 0;
        // for (String s : words)
        // 	if (s.startsWith(pref))
        // 		res++;
        // return res;
      
//  Solution with IndexOf Function
      
        int count = 0;
        
        for(String w : words)
		{
            if(w.indexOf(pref) == 0){
                count++;
            } else {
                count+= 0;
            }
        }
        return count;
     
      
    }
}