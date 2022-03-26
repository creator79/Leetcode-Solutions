class Solution {
    public List<Integer> grayCode(int n) {
        
        List<String> ans = gray(n);
        List<Integer> ans1 = new ArrayList<>();
        
        for(int i=0; i<ans.size(); i++) {
            String m = ans.get(i);
            long k = Long.parseLong(m,2);
            int x = (int)k;
            ans1.add(x);
            
        }
        
        return ans1;
    }
//     // logic part
//   1 bit gray code 0 1
    
//   2 bit gray code 0 0
//                   0 1
//                   1 1
//                   1 1
    
//   3 bit gray code 0 0 0
//                   0 0 1
//                   0 1 1
//                   0 1 0
//                   1 1 0
//                   1 1 1
//                   1 0 1
//                   1 0 0
//       here we observed only differnce in 1 bit and we add "0" while genrate a gray code of n bit and add "1" while revesing the n bit
  
    public List<String> gray(int n) {
        
        if(n==1) {
            List<String> m = new ArrayList<String>();
            m.add("0");
            m.add("1");
            return m;
        }
        
        List<String> rres = gray(n-1);
        List<String> mres = new ArrayList<String>();
        // forwarding while genrate the gray code 
        for(int i=0; i<rres.size(); i++) {
          String rstr = rres.get(i);
            mres.add("0"+ rstr);
        }
        // reversing 
        for(int i=rres.size()-1; i>=0; i--) {
            String rstr = rres.get(i);
            mres.add("1"+ rstr);
        }
        
        return mres;
    }   
}