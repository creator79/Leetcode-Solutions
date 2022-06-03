class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>(); // to remove the duplicates
        for(int i : nums){
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set); //as we need to sort the set
        Collections.sort(list);
        
        if(list.size() == 2){
            return Math.max(list.get(0),list.get(1));
        }
        if(list.size() == 1){
            return list.get(0);
        }
        
        return list.get(list.size()-3); // we need to return the third maximum element. So, subtract 3 from it.
        }
}