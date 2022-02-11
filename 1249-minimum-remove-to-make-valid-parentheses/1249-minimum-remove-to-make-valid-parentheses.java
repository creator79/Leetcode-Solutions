class Solution {
    public String minRemoveToMakeValid(String s) {
 char arr[]=s.toCharArray();
        int count=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(ch=='('){
                st.push(i);
            }else if(ch==')'){
                if(st.size()==0){
                    arr[i]='.';
                    count++;
                }else{
                    st.pop();
                }
            }
        }
        while(st.size()>0){
            arr[st.pop()]='.';
            count++;
        }
        
        char ans[]=new char[arr.length-count];
        int idx=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='.'){
                ans[idx]=arr[i];
                idx++;
            }
        }
        return new String(ans);
    }
}