class Solution {

    int row,col;
    public int latestDayToCross(int row, int col, int[][] cells) {
        if (row == 1) return 0;
        this.row = row; this.col = col;
        int low = col-1, high = row*col - row;
        while (high > low) {
            int guess = (high + low)/2;
            if (crossAtDayPossible(guess,cells)) {
                if (low == high -1) return (crossAtDayPossible(high,cells)) ? high : low;
                low = guess;
            }
            else high = guess - 1;
        }
        return high;
    }   

    final int dirs[][] = new int [][]{{1,0},{0,1},{-1,0},{0,-1}};
    private boolean crossAtDayPossible(int guess, int[][] cells){
        Set<Integer> visitedOrWater = new HashSet();
        for (int i = 0; i < guess; i++) visitedOrWater.add((cells[i][0] - 1) * 10001 + (cells[i][1] - 1));
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<col;i++) if (!visitedOrWater.contains(i)) q.offer(i);
        while (!q.isEmpty()){
            int cell = q.poll();
            for (int [] dir: dirs){
                int i = cell/10001 + dir[0], j = cell % 10001 + dir[1] , next = i * 10001 + j;
                if (i>0 && i<row && j>=0 && j < col && !visitedOrWater.contains(next)){
                    if (i==row-1) return true;
                    visitedOrWater.add(next);
                    q.offer(next);
                }
            }
        }
        return false;
    }
}