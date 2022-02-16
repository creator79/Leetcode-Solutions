class Solution {
//     Intuition :
// 1) If string does not have inner substring like this 3[a5[cd]] then it can be solved easily (simple iteration)
// 2) In some cases, we can have inner sub string as I mentioned above then it is best to solve with stack. Solve inner substring first.(Iterative approach)
// 3) Insert the character in stack until you find ']' char
// 4) If you find ']' char then pop the character until you find '[', This is how you can get the substring.
// 5) Remove the '[' character
// 6) Find the number k, number can be in single digit, two digits, .. so on.
// 7) Put back the substring k times in stack
// 8) Atlast take the result in one char array because stack format will not in string format.
// 9) return the result
public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                stack.push(ch);
            }else{
                //get the sub string
                StringBuilder sb = new StringBuilder();
                while(stack.peek() != '['){
                    sb.append(stack.pop());
                }
                //remove the '[' character
                stack.pop();
                //get the number
                int k = 0;
                int base = 1;
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    k = (stack.pop() - '0') * base + k;
                    base *= 10;
                }
                //put back the substring in stack k times
                while(k-- > 0){
                    for(int i=sb.length()-1; i>=0; i--){
                        stack.push(sb.charAt(i));
                    }
                }
            }
        }
        char[] result = new char[stack.size()];
        for(int i=stack.size()-1;i>=0;i--)
            result[i] = stack.pop();
        return new String(result);
    }
}