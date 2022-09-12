// It is always profitable to face up (loss power, gain score) tokens with less power and face down (gain power, loss score) token with more power.

// sort the token in increasing order
// create two pointer i, j, where i = 0, j = n ; initially
// 0 <= x <= i represent the tokens face up i.e, [Score ⬆, Power ⬇]
// j <= x <= n represent the tokens face down i.e, [Score ⬇, Power⬆]
// if we have sufficient power to face up ith token, power - token[i], i++.
// else if we have some score [i - (n - j)] face down jth token, j--, power + token[j].
// i - (n - j) represents the score since (face up - face down) = score, face up = i and face down = n - j
// Note :we also need to check if we face down j we should have some unplayed token to face up. That's why we are checking j > i + 1
// if we have no move to make break the loop.
class Solution {

    public int bagOfTokensScore(int[] a, int p) {
        int n = a.length;
        if (n == 0) return 0;
        Arrays.sort(a);
        int i = 0;
        int j = n - 1;
        int cur = 0;
        int max = 0;
        while (i <= j) {
            if (p >= a[i]) {
                p -= a[i];
                cur++;
                if (cur > max) max = cur;
                i++;
            } //if
            else if (cur >= 1) {
                p += a[j];
                j--;
                cur--;
            } //else
            else break;
        } // while
        return max;
    }
}
