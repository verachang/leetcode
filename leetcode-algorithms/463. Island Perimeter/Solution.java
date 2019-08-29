class Solution {
    public int islandPerimeter(int[][] grid) {
        int i =0, j = 0;
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for(i=0; i < m; i++) {
            for(j= 0; j<n; j++) {
                if(grid[i][j] == 0) { continue; }
                res = res+4;
                if(j+1 < n && grid[i][j+1] == 1) {
                    res = res-2;
                } 
                if (i+1 < m && grid[i+1][j] == 1) {
                    res = res -2;
                }
            }
        }

        return res;
    }
}
