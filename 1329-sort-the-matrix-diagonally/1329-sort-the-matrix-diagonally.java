class Solution {

   // When you iterate the matrix keep track of the diagonal key. The diagonal key can be computed by row - column. We can use that key for our hashmap, and store all values for that key in a min heap. The min heap will order things for us as we add items to it. Iterate over the matrix again, and use the key to poll the value (min element) from the queue.


    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap();
        for (int i = 0; i < mat.length;i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int key = i - j;
                PriorityQueue<Integer> q = map.getOrDefault(key, new PriorityQueue<Integer>((a,b)-> a - b));
                q.add(mat[i][j]);
                map.put(key, q);
            }   
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int key = i - j;
                mat[i][j] = map.get(key).poll();
            }
        }
        return mat;
    }
}