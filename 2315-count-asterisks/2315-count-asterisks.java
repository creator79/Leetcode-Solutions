class Solution {
    public int countAsterisks(String s) {
        Boolean flag=false;
        int count =0;
        for(char i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='|') flag = !flag;
            if(!flag){ // flag still false 
              if(ch=='*')   count++;
            }
        }
        return count;
    }
}