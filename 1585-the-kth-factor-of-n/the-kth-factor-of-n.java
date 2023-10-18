class Solution {
     List<Integer> res = new ArrayList<Integer>();
    public int kthFactor(int n, int k) {
        factor(n);
// for (int i = 0; i < res.size(); i++) {
//   System.out.println(res.get(i));
// }



       if (k <= res.size()) {
        //    System.out.println(res.get(k - 1));
            return res.get(k - 1);  
        } else {
            return -1;  
        }
    }


    public List<Integer> factor(int n){
        for(int i=1;i<n;i++){
            if(n%i==0){
                res.add(i);
            }
        }
       res.add(n);
        // Collections.sort(res);
        return res;
    }
   
}