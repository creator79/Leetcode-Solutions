class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        
        for(int pp = stones.length - 1; pp > 0; pp--){
            stones[pp - 1] = stones[pp] - stones[pp - 1];
            Arrays.sort(stones);
        }
        return stones[0];
    }
}