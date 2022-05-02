class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Stack<Integer> odd = new Stack<>();
        Stack<Integer> even = new Stack<>();
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0) odd.push(nums[i]);
            else even.push(nums[i]);
        }
        // ans bnan hai 
        int ans[] = new int[nums.length];
        int i = 0;
        while(!even.isEmpty()){
            ans[i++] = even.pop();
        }
        while(!odd.isEmpty()){
            ans[i++] = odd.pop();
        }
        return ans;
    }
}
