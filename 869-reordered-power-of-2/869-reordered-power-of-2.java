/*
find all the permutations of given number and check if its power of 2 or not
182 = 182,128,218,281 give tle sure
where 128 is power of 2 sor its return true {+ve cases}
 47 {-ve case}
 
 ~~~~~~~~~~~~~How to get power of 2 ~~~~~~~~~~~~~
 get divde the number until its remainder will be 1
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

*/
class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] freqOfN = new int[10];
        int sizeofN = 0;
        
         while(n>0){
            freqOfN[n%10] += 1;
            n /= 10;               
        }
        
        for(int i=0;i<31;i++){
            if(Arrays.equals(freqOfN,getFreqArray((int)Math.pow(2,i)))){
                return true;
            }
        }
        
         return false;
    }      
      
    public int[] getFreqArray(int num){
        int[] freqOfnum = new int[10];
        
       while(num>0){
            freqOfnum[num%10] += 1;
            num /= 10;               
        } 
        
        return freqOfnum;
    }
        
    
}