class Solution {
    public String removeKdigits(String num, int k) {
        if(k >= num.length() )
            return "0";
        Stack<Character> stack = new Stack<>(); //initialize a stack
        for(int i = 0; i < num.length(); i++){
            char c = num.charAt(i); 
			 //check if the top character is greater than the current character of string
            while(!stack.isEmpty() && k > 0 && stack.peek() > c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        
        // for cases like 1111, 9999, etc.
        while(!stack.isEmpty() && k > 0){
            stack.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse(); // The string we got from stack that is in reverse order so reverse again to get correct sequence
        
        while(sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0); //while there is 0 int starting of string remove it
        
        return sb.toString();
    }
}