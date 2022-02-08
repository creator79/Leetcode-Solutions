class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
     int j = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<pushed.length; i++){
            stack.push(pushed[i]);
            
            while(!stack.isEmpty() && j < pushed.length && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }
        return (j == pushed.length);
    }
}

