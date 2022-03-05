class Solution {
    public int deleteAndEarn(int[] nums) {
      //Top down apporach
      // Concept Inclusion and exclusion
       int inc =0;
       int exc = 0;
      int  count[]= new int [10001]; //0....10000
      // MAke count array
      for(int val : nums){
        count[val]++;
      }
      // Count ke array pe kaam karunga
      for (int i=0;i<=10000;i++){
          int nix= exc+count[i]*i;
          int nex=Math.max(inc,exc);
            inc=nix;
            exc= nex;
        
      }
        return Math.max(inc,exc);
    }
}