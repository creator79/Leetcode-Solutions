​
​
​
// jumba code
class Solution {
public boolean isInterleave(String s1, String s2, String s3) {
if(s1.length() + s2.length() != s3.length())
return false;
return helper(s1, s2, s3, 0, 0);
}
​
public boolean helper(String s1, String s2, String s3, int i, int j) {
if(i+j == s3.length())
return true;
if(i < s1.length() && s3.charAt(i+j) == s1.charAt(i)) {
boolean flag = helper(s1, s2, s3, i+1, j);
if(flag)
return true;
}
​
if(j < s2.length() && s3.charAt(i+j) == s2.charAt(j)) {
boolean flag = helper(s1, s2, s3, i, j+1);
if(flag)
return true;
}
​
return false;
}
}