class Solution {

    public int kthSmallest(int[][] matrix, int k) {
        //         Jab array sorted ho tab binary search socho toh ussme mutiple test cases ko handle karna hoga
        //         Jaha bhai k min ya k max ki baat ho hogi vah priority queue implement karne ki  sochha karo
        int r = matrix.length;
        int c = matrix[0].length;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                pq.add(matrix[i][j]);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }
        return pq.peek();
    }
}
