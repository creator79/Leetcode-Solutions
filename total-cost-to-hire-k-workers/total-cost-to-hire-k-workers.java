class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
         long ans=0;
        PriorityQueue<Integer> piq1 = new PriorityQueue<Integer>();
        PriorityQueue<Integer> piq2 = new PriorityQueue<Integer>();
        int i=0;
        while(i<candidates){
            piq1.add(costs[i]);
            i++;
        }
        int count=0;
        int j= costs.length-1;
        if(candidates > costs.length- candidates){
            candidates= costs.length- candidates;
        }

        while(count<candidates){
            piq2.add(costs[j]);
            count++;
            j--;
        }

        while(k-- > 0){
            if(piq1.size()==0){
                ans+=piq2.poll();
                if(i<=j){
                   piq2.add(costs[j]);
                    j--;
                } 

            }
            else if(piq2.size()==0){
                ans+=piq1.poll();
                if(i<=j){
                    piq1.add(costs[i]);
                    i++;
                } 
            }
            else if(piq1.peek()<=piq2.peek()){
                ans+=piq1.poll();
                if(i<=j){
                    piq1.add(costs[i]);
                    i++;
                }
            }
            else{
                ans+=piq2.poll();
                if(i<=j){
                 piq2.add(costs[j]);
                    j--;
                } 
                
                
            }
        }
        return ans;
        
    }
}