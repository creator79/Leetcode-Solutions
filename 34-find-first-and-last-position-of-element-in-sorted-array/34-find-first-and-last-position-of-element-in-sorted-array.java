class Solution {

    public int[] searchRange(int[] nums, int x) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        for (int i : nums) arr1.add(i);

        int first = arr1.indexOf(x);
        Collections.reverse(arr1);
        int last = arr1.size() - 1 - arr1.indexOf(x);

        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(first);
        ans.add(last);


        if (!arr1.contains(x)) {
         return  new  int  []  { -1, -1 };
        }

        /*ArrayList to Array Conversion */
        int array[] = new int[ans.size()];
        for (int j = 0; j < ans.size(); j++) {
            array[j] = ans.get(j);
        }
        return array;
    }
}
