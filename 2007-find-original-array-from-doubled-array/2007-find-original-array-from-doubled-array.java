class Solution {
    public int[] findOriginalArray(int[] changed) {
      Arrays.sort(changed);
        List<Integer> list = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();

    for (int nums : changed) {
       if(!queue.isEmpty() && nums==queue.peek()){
              queue.poll();
    }
    else{
        queue.offer(nums*2);
        list.add(nums);

    }
    }
    if(queue.isEmpty()){
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    return new int[]{};
    
      
        
        
    }
}