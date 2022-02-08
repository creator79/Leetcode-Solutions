class Solution {
    public int[] nextGreaterElements(int[] arr) {
       int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);    
        for(int i = 1 ; i < arr.length ; i++){
            while(st.size() > 0 && arr[st.peek()] < arr[i])
            {  
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        for(int i = 0 ; i < arr.length ; i++){
            while(arr[st.peek()] < arr[i])
            {
                ans[st.peek()] = arr[i];
                st.pop();
            }
        }
          while(st.size() > 0){
            ans[st.peek()] = -1;
            st.pop();
        }
        return ans;
      
        
    }
}