class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        combi(res,new ArrayList<>(),1,0,k,n);
        return res;
    }
    public void combi(List<List<Integer>> res,List<Integer> ds,int num,int sum,int k,int n){
        if(k==0 && n==sum){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=num;i<=9;i++){
            sum+=i;
            ds.add(i);
            combi(res,ds,i+1,sum,k-1,n);
            sum-=i;
            ds.remove(ds.size()-1);
        }
    }
}