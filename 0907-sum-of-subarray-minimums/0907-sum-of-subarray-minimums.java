class Solution {
       int M = (int) 1e9 + 7;
    public int sumSubarrayMins(int[] arr) {
     
    int n = arr.length;
    int[] left = new int[n], right = new int[n];
    Deque<Integer> q = new ArrayDeque<>(); // store index
    q.offer(-1);
    for (int i = 0; i < n; i++) {
        while (q.peekLast() != -1 && arr[q.peekLast()] >= arr[i]) q.pollLast();
        left[i] = i - q.peekLast();
        q.offer(i);
    }

    q.clear();
    q.offer(n);
    for (int i = n - 1; i >= 0; i--) {
        while (q.peekLast() != n && arr[q.peekLast()] > arr[i]) q.pollLast();
        right[i] = q.peekLast() - i;
        q.offer(i);
    }

    long res = 0;
    for (int i = 0; i < n; i++) {
        res = (res + 1L * left[i] * right[i] * arr[i]) % M;
    }
    return (int) res;


    }
}