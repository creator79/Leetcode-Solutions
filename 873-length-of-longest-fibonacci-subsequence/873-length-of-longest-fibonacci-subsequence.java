class Solution {
    public int lenLongestFibSubseq(int[] arr) {
	Set<Integer> set = new HashSet<>();
	for (int n : arr) set.add(n);
	int len = arr.length;
	int max = 0;
	for (int i = 0; i < len-2; i++) { // `i` stand for the minimum index for a group fib
		for (int j = i+1; j < len-1; j++) { // `j` followed `i`
			int cnt = 2;
			int a = arr[i], b = arr[j];
			while (set.contains(a+b)) {
				int c = b;
				b += a;
				a = c;
				cnt++;
			}
			if (cnt > 2) max = Math.max(max, cnt);
		}
	}
	return max;
}
}