// Define the 3 numbers: left <= mid <= right, left + mid + right = target
class Solution{

    public int threeSumMulti(int[] arr, int target) {
        int max = Math.min(100, target);  // left, mid and right are in the range [0, max]
        int[] count = new int[101];
        for (int i : arr)  // bucket sort and count the appearance
        	count[i]++;
        long res = 0;
        for (int mid = 0; mid <= max; mid++)  // navigate the mid number
        	for (int left = 0, right = target - left - mid; left <= mid && right >= mid; left++, right--)
        		if (right > max)
        			continue;
        		else if (left == right) // left == mid == right
        			res += (long)count[mid] * (count[mid] - 1) * (count[mid] - 2) / 6 % 1000000007;
        		else if (left == mid)   // left == mid < right
        			res += (long)count[right] * count[mid] * (count[mid] - 1) / 2 % 1000000007;
        		else if (right == mid)  // left <  mid == right
        			res += (long)count[left] * count[mid] * (count[mid] - 1) / 2 % 1000000007;
        		else                    // left <  mid <  right
        			res += (long)count[left] * count[mid] * count[right] % 1000000007;
        return (int)(res % 1000000007);
    }
}