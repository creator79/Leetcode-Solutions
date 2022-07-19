class Solution {
    public int minBitFlips(int num1, int num2) {
      
      int flipped = num1 ^ num2;
      int count =0;
      while(flipped!=0){
        int rsb =(flipped & -flipped);
        flipped -= rsb;
        count++;
      }
        return count;
    }
}