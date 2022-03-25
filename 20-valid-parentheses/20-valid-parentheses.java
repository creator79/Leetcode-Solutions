// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> st=new Stack<>();
        
//         for(int i=0;i<s.length();i++)
//         {
//             char ch=s.charAt(i);
//             if(st.isEmpty() && (ch==']' || ch=='}' || ch==')'))
//                 return false;
//             if(ch=='(' || ch=='{' || ch=='[')
//                 st.push(ch);
//             else{
//                 if(ch==')' && st.pop()!='(')
//                     return false;
//                 if(ch==']' && st.pop()!='[')
//                     return false;
//                 if(ch=='}' && st.pop()!='{')
//                     return false;
//             }
//         }
//         return st.isEmpty();
//     }
// }
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}