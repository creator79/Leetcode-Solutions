class Solution {
       public String simplifyPath(String path) {
        if(path.length()==1)
            return path;
        String st[]=path.split("/");
        HashSet<String> set=new HashSet<>(Arrays.asList("..",".","")); // ignore this substring and not push in code
        Stack<String> stack=new Stack<>();
        for(String s:st){
            if(s.equals("..") && !stack.isEmpty())
                stack.pop();
            if(!set.contains(s))
                stack.push(s);
        }
        if(stack.isEmpty())
            return "/";
         String ans="";
        while(!stack.isEmpty()){
            if(ans=="")
              ans=stack.pop();
        else
            ans=stack.pop()+"/"+ans;
        }
        return "/"+ans;
    }

}