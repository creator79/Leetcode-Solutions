class KthLargest {
    private PriorityQueue<Integer> pq;
    private int k;
    public KthLargest(int k, int[] nums) {
        List<Integer> list= new ArrayList<Integer>();  
        for(int i = 0; i < Math.min(k, nums.length); ++i) list.add(nums[i]);
        pq = new PriorityQueue<>(); pq.addAll(list);
        this.k = k;
        for(int i = k; i < nums.length; ++i) {
            pq.add(nums[i]);
            pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size() > k) pq.poll();
        return pq.peek();
    }
}


/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */