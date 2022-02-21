class Solution {
    public int longestValidParentheses(String s) {
      Stack<Integer> st =new Stack<>();
      st.push(-1);
      int max=0;
      char a[]=s.toCharArray();
      
      for(int i=0;i<s.length();i++)
        {
             if(a[i]=='(')st.push(i);
             else{
                 st.pop();
                 
                 if(st.empty()) st.push(i);
                 else max=Math.max(max,i-st.peek());
                 }
        }
      return max;   
}
        
    }
