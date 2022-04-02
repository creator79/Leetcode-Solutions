class Solution {
    public void reverseString(char[] s) {
      // lets try with stack my fav ones 
        Stack<Character> stk = new Stack<>();
        for(char each: s) stk.push(each);
        int i = 0;
        while(!stk.empty()) {
            s[i] = stk.pop();
            i += 1;
        }
// Recursion (O(n))
// void reverse(int p1, int p2, char[] s) {
//         if(p1 < p2) {
//             char temp = s[p1];
//             s[p1] = s[p2];
//             s[p2] = temp;
//             reverse(p1 + 1, p2 - 1, s);
//         }
//     }
	
// 	Call from reverseString method: reverse(0, s.length -1, s);
    }
}