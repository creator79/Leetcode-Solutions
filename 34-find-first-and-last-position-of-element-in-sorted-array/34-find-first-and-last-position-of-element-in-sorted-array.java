class Solution {

    public int[] searchRange(int[] nums, int x) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        for (int i : nums) arr1.add(i);

        int first = arr1.indexOf(x);
        Collections.reverse(arr1);
        int last = arr1.size() - 1 - arr1.indexOf(x);

        


        if (!arr1.contains(x)) {
         return  new  int  []  { -1, -1 };
        }
        ArrayList<Integer> finalans = new ArrayList<Integer>();
        finalans.add(first);
        finalans.add(last);

        /*ArrayList to Array Conversion */
        int array[] = new int[finalans.size()];
        for (int j = 0; j < finalans.size(); j++) {
            array[j] = finalans.get(j);
        }
        return array;
    }
}
