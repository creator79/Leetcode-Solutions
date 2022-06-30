class Solution {
      public static int trap(int[] height) {
      int j= height.length-1;
      int[] l = new int[height.length];
      int[] r = new int[height.length];
      int lMax =0;
      int rMax =0;
      
      int res =0;
      
      for(int i=0;i<height.length;i++) {
        lMax = Math.max(lMax, height[i]);
        l[i] = lMax;
        rMax = Math.max(rMax, height[j]);
        r[j] = rMax;
        j--;
      }
      
      for(int i=0;i<height.length;i++) {
        res+= Math.min(l[i],r[i])-height[i];
      }
      
      return res;
  
    }
  }