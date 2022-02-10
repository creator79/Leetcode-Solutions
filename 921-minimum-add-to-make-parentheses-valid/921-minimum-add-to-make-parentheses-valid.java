class Solution {
/*Approach: check if the character in the stack is '(' or not and the character at string index i = ')' or not because in order to make a valid paranthesis '(' should always have ')' after it.*/
     public int minAddToMakeValid(String s) {
        Stack<Character>st = new Stack<>();
        
        for(int i=0; i < s.length();i++) {
            char ch = s.charAt(i);
            
            if(ch == '(') {
                st.push(ch);
            }
            else if(ch == ')') {
                //is '(' available for me
                if(!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
                else {
                    st.push(ch);
                }
            }
        }
        
        return st.size();
    }
}

