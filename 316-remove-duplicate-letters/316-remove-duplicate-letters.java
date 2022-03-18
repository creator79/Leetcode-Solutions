//Make a stack, in this we will maintain lexicographical order,
// count the frequency of all
// make boolean array of 26
// "cbacdcbc"---->input
// traverse each, first is----> 'c' ,in boolean it is false for now, so check wherthr stack is empty ,yes it is, so push 'c' in stack and make boolean true for c now, meaning whenever we will find a 'c' we will not include it in our answer, decrease the frequency of element you pass by.

// next is---->b---> boolean at this place is false for now, so check whether stack is empty, no it has element, now check whether that top element is greater, yes it is greater c>b, and also c's frequency is greater than 0, so pop it,make c's boolean false, push 'b' in stack and make b's boolean true.decrease the frequency of element you pass by(Here b)

// next is--->a--->boolean at this place is false for now, so check whether stack is empty, no it has element, now check whether that top element is greater, yes it is greater b>a, and also b's frequency is greater than 0, so pop it,make b's boolean false, push 'a' in it and make a's boolean true.decrease the frequency of element you pass by(Here a).

// next is--->c--->boolean at this place is false for now, so check whether stack is empty, no it has element, now check whether that top element is greater,No, a>c,is false, and also a's frequency is equal to 0, so dont pop it, ,make c's boolean true, push 'c' in it .decrease the frequency of element you pass by(Here c).

// and keep doing this for entire string.
 //Why boolean array?
// Becuase we maintain here that once a character is inside stack, it should not be push back again, remember when we pop elements we make its boolean false, because it can be reconsidered later inside stack as per lexcographical order.

        
      class Solution {
    StringBuilder t=new StringBuilder();
    public String removeDuplicateLetters(String s) {
        int map[]=new int[26];
        boolean b[]=new boolean[26];
        
        Stack<Character> st=new Stack<Character>();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            map[ch-'a']++;
        }
       
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
             if(!b[c-'a'])
             {
                 while(!st.empty() && map[st.peek()-'a']>0 && st.peek()>c)
                 {
                     
                     b[st.pop()-'a']=false;
                 }
                 st.push(c);
                 b[c-'a']=true;
                 
             }
            map[c-'a']--;
            
            
        }
      
   
        
        System.out.println(st);
        reversestack(st);
        
      
        return t+"";
    }
    public void reversestack(Stack<Character> st)       //directly reads stack in reverse. // you can make this simple
    {
        if(st.empty())
        {
            
            return;}
        
        
         char top=st.pop();
       
            reversestack(st);
            
           t.append(top);
     
    }
}