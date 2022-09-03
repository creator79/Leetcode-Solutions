class Solution {
    
    public int[] numsSameConsecDiff(int n, int k) {
            if (n == 1) {
                return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            }
            List<Integer> res = new ArrayList<>();
            for (int i = 1; i <= 9; i++) {
                dfs(i, n - 1, k, res);
            }
            return res.stream().mapToInt(i -> i).toArray();
        
            
        
    }

    private void dfs(int num, int n, int k, List<Integer> res) {
        if (n == 0) {
            res.add(num);
            return;
        }
        int lastDigit = num % 10;
        if (lastDigit - k >= 0) {
            dfs(num * 10 + lastDigit - k, n - 1, k, res);
        }
        if (lastDigit + k <= 9 && k != 0) {
            dfs(num * 10 + lastDigit + k, n - 1, k, res);
        }
    }
}