class Solution {
    public int[][] merge(int[][] intervals) {
	// Sort the array
        Arrays.sort(intervals,(arr1,arr2)->arr1[0]-arr2[0]);
        
		// New Array for the result
        ArrayList<int[]> list=new ArrayList<>();
		
		// Iterate through the array
        for(int[] interval:intervals){
            if(list.size()==0){
                list.add(interval);
            }
			else{
                int[] prev_interval=list.get(list.size()-1);
				// Condition for the overlap
                if(prev_interval[1]>=interval[0]){
                    
                    prev_interval[1]=Math.max(prev_interval[1],interval[1]);
                    list.set(list.size()-1, prev_interval);
                    
                }
                    
                else
                    list.add(interval);
            }
        }
		
		// convert the array to list
        return list.toArray(new int[list.size()][]);
    }
}