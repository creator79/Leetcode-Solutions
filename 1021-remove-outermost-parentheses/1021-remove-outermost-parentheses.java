class Solution {
    public String removeOuterParentheses(String s) {
      Stack<Character>st = new Stack<>();
      StringBuilder sb =new StringBuilder("");
      for(int i=0 ; i<s.length();i++){
        char ch = s.charAt(i);
        if(ch=='('){
//st.size()!=0 This lies is check of 
// logic 1 stack agar empty hogya toh vo Outermost Parentheses last pop element hoga
// logic 2 firstly opening brackets ke liye closing brackets check karo agar stack empty hai toh ans mat bnaao agara stack empty nhai hai toh usse string builder me add karke ans bnaa lo 
// yahi humara main logic hai ki hume inner parentheses ko apna ans bana hai 
          if(st.size()!=0){
            sb.append('(');
          }
          st.push(ch);
        }
        else{
        st.pop();
        if (st.size()!=0){
          sb.append(')');
         
      }
      
        }
      }
        return sb.toString();
    }
}