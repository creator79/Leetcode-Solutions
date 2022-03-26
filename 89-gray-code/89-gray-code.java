// see the itrerative aapoch in notes

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList();
        
        if(n==0){
            ans.add(0);
            return ans;
        }
        
        List<Integer> list = grayCode(n-1);
        
        for(int i =0;i<list.size();i++){
            int val = list.get(i)<<1; // <<  1  sabke saamne one likh do 
            ans.add(val);
        }
        
        for(int i =list.size()-1;i>=0;i--){
            int val = (list.get(i)<<1) + 1;
            ans.add(val);
        }
        
        return ans;
    }
}