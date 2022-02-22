class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         Set<List<Integer>> ans = new HashSet<>();
    
    Arrays.sort(nums);
    
    for(int i=0;i<nums.length;i++){
        
        for(int j=nums.length-1;j>=0 && j>i;j--){
            
            int k=i+1;
            int l=j-1;
            
            while(k<l){
                
                int a = nums[i];
                int b = nums[j];
                int c = nums[k];
                int d = nums[l];
                
                if(a+b+c+d==target){
                    
                    List<Integer> lt = new ArrayList<>();
                    lt.add(a);
                    lt.add(b);
                    lt.add(c);
                    lt.add(d);
                    
                    ans.add(lt);
                    k++;
                    l--;
                }else if(a+b+c+d<target)k++;
                
                else l--;
                
            }
            
        }
        
    }
    return new ArrayList<>(ans);
    }
}