class WordFilter {
  HashMap<String, SortedSet<Integer>> pref, suff;
  
  public WordFilter(String[] words) {
    pref = new HashMap<String, SortedSet<Integer>>();
    suff = new HashMap<String, SortedSet<Integer>>();
    
    for(int i = 0; i != words.length; i++){
      char letters[] = words[i].toCharArray();
      
      for(int j = 0; j != letters.length; j++){                //put all suffixes
        String s = new String(letters, j, letters.length - j); 
        if(!suff.containsKey(s)) suff.put(s, new TreeSet<Integer>().descendingSet());
        suff.get(s).add(i);
      }
      
      for(int j = letters.length; j != 0  ;j--){               //put all prefixes 
        String s = new String(letters, 0, j); 
        if(!pref.containsKey(s)) pref.put(s, new TreeSet<Integer>().descendingSet());
        pref.get(s).add(i);
      }
    }
  }
    
  public int f(String prefix, String suffix) {
    if(pref.containsKey(prefix) && suff.containsKey(suffix))
      for(Integer id : pref.get(prefix))
        if(suff.get(suffix).contains(id)) return id;
    
    return -1;    
  }
}
/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,sclass WordFilter {
  HashMap<String, SortedSet<Integer>> pref, suff;
  
  public WordFilter(String[] words) {
    pref = new HashMap<String, SortedSet<Integer>>();
    suff = new HashMap<String, SortedSet<Integer>>();
    
    for(int i = 0; i != words.length; i++){
      char letters[] = words[i].toCharArray();
      
      for(int j = 0; j != letters.length; j++){                //put all suffixes
        String s = new String(letters, j, letters.length - j); 
        if(!suff.containsKey(s)) suff.put(s, new TreeSet<Integer>().descendingSet());
        suff.get(s).add(i);
      }
      
      for(int j = letters.length; j != 0  ;j--){               //put all prefixes 
        String s = new String(letters, 0, j); 
        if(!pref.containsKey(s)) pref.put(s, new TreeSet<Integer>().descendingSet());
        pref.get(s).add(i);
      }
    }
  }
    
  public int f(String prefix, String suffix) {
    if(pref.containsKey(prefix) && suff.containsKey(suffix))
      for(Integer id : pref.get(prefix))
        if(suff.get(suffix).contains(id)) return id;
    
    return -1;    
  }
}uffix);
 */