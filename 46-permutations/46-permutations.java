class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numsList=new ArrayList<>();
        int index=0;
        for(int x: nums){
        numsList.add(x);
        }
        solve(index, ans, numsList);
        return ans;
    }
    void solve(int index, List<List<Integer>> ans, List<Integer> nums){
        //Base case
        if(index>=nums.size()){
            ans.add(new ArrayList(nums));
            return;
        }
        //Solve for one case
        for(int i=index;i<nums.size();i++){
           Collections.swap(nums,i,index);
            solve(index+1, ans, nums);
            Collections.swap(nums,i,index);
        }
    }
}