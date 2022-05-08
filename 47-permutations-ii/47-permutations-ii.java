class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        HashSet<List<Integer>> ans=new HashSet<>();
        boolean check[]=new boolean[nums.length];
        generate(nums,check,0,ans,new ArrayList<>());
        
        return new ArrayList<>(ans);
        
    }
    
    void generate(int nums[],boolean check[],int i,HashSet<List<Integer>> ans,List<Integer> curr){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int j=0;j<nums.length;j++){
            if(check[j]) continue;
            check[j]=true;
            curr.add(nums[j]);
            generate(nums,check,j,ans,curr);
            curr.remove(curr.size()-1);
            check[j]=false;
        }
    }
}