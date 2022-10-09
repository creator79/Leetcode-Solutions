class Solution {
    // good question as implementation wise
    public int hardestWorker(int n, int[][] logs) {
        int m = logs.length;
        int ans = logs[0][0], time = logs[0][1];
        for(int i = 1; i < m; i++){
            if(logs[i][1] - logs[i - 1][1] > time){
                ans = logs[i][0];
                time = logs[i][1] - logs[i - 1][1];
            }
            //  same time the we should return min id
            else if(logs[i][1] - logs[i - 1][1] == time){
                if(ans > logs[i][0]){
                    ans = logs[i][0];
                }
            }
        }
        return ans;
    }
}