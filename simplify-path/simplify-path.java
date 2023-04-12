class Solution {
    public String simplifyPath(String s) {
        
        String res = "/";
        String[] arr = s.split("/");
        Stack<String> st = new Stack<>();
        for (String str : arr){
            if (str.equals("..")){
                if (!st.isEmpty()){
                    st.pop();
                }
            }
            else if (!str.equals(".") && !str.equals("")){
                st.push(str);
            }
        }
        while (!st.isEmpty()){
            res = "/" + st.pop() + res;
        }
        if (res.length() > 1){
            res = res.substring(0, res.length() - 1);
        }
        return res;
 
    }
}