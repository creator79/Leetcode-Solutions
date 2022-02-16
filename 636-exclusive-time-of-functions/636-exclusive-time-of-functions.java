class Solution {
    public class ETHelper{
        int id;
        int sTime;
        int cet;
        
        ETHelper(int id,int sTime,int cet){
            this.id=id;
            this.sTime=sTime;
            this.cet=cet;
        }
    }
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<ETHelper> st=new Stack<>();
        int[] res=new int[n];
        for(String s:logs){
            String[] token=s.split(":");
            int id=Integer.parseInt(token[0]);
            String status=token[1];
            int timeStamp=Integer.parseInt(token[2]);
            
            if(status.equals("start")){
                st.push(new ETHelper(id,timeStamp,0));
            }else{
                int fn_diff=timeStamp-st.peek().sTime+1;
                int et=fn_diff-st.peek().cet;
                
                res[id--]+=et;
              
                st.pop();
                if(st.size()>0){
                    st.peek().cet+=fn_diff;
                }
            }
        }
        return res;
    }
}