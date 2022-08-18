class Solution {

    public int minSetSize(int[] arr) {
        int size = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) map.put(ele, map.getOrDefault(ele, 0) + 1);

        ArrayList<Integer> al = new ArrayList<>(map.values());
        Collections.sort(al, Collections.reverseOrder());
int minSet =0;
int total=size;
int i=0;
        while(total>size/2){
            total-=al.get(i);
            i++;
            minSet++;
        }
       

        return minSet;
    }
}


// 3--4
// 5--3
// 2--2
// 7--1
// Logic click we use hashmap because question needs frequency map kind of thing
// ab ye ensure karna hai ki minimum value hi set me rahe useke liye hashmap me jo max frequency usko use karo .
// Get the frequency and sort them in descending order.
// While the total elements are less than required add them and increment our sets.
// Return minimumSets.
    