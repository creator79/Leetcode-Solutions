class Solution {
    public boolean isPalindrome(int num) {
        if(num<0) return false;

    int  reversedNum = 0, remainder;
    
    // store the number to originalNum
    int originalNum = num;
    
    // get the reverse of originalNum
    // store it in variable
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    // check if reversedNum and originalNum are equal
    return (originalNum == reversedNum) ;
        
    }
}