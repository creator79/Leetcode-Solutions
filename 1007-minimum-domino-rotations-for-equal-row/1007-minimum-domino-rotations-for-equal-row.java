//  we create a Function "f" which take two array(i.e "a" & "b") and one integer value(i.e "val")
// --> "f" return minimum number of operation required to convert array "a" to "val"
// --> We Check For each integer from 1 to 6 for each from array top to bottom and viceversa
// --> We take minimum for each value and if not possible then we ignore
// --> if "min" not change then it means our aim is not possible and return -1
// --> last return min


class Solution {
    public static int f(int[] a,int[] b,int val) {
        int ans=0;
        for(int i=0;i<a.length;i++) {
            if(b[i]==val && a[i]!=val) ans++;
            if(b[i]!=val && a[i]!=val) return -1;
        }
        return ans;
    }
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=6;i++) {
            int t1 = f(tops,bottoms,i);
            int t2 = f(bottoms,tops,i);
            if(t1!=-1) {
                min = Math.min(t1,min);
            }
            if(t2!=-1) {
                min = Math.min(t2,min);
            }
        }
        if(min==Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
}