class Solution {
    int toInt(String s){
        int n = 0;
        for(char c:s.toCharArray())
            if((n&(1<<(c-'a')))>0 || (n+=(1<<(c-'a')))<0 ) return 0;
        return n;
    }
    int max = 0;
    Set<Integer> chked = new HashSet<>(Arrays.asList(0));
    void f(int n, int[] iarr){
        if(chked.contains(n) || (max = Math.max(max, Integer.bitCount(n)))==26) return;
        for(int m:iarr)
            if(m>0 && (n&m)==0) f(n|m, iarr);
        chked.add(n);
    }
    public int maxLength(List<String> arr) {
        int[] iarr = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) iarr[i]= toInt(arr.get(i));
        for(int n:iarr) f(n, iarr);
        return max;
    }
}