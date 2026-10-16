class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    count++;
                    sinkIsland(grid, r, c);
                }
            }
        }
        return count;
    }
    private void sinkIsland(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) return;
        if (grid[r][c] == '0') return;
        grid[r][c] = '0'; 
        sinkIsland(grid, r - 1, c); 
        sinkIsland(grid, r + 1, c); 
        sinkIsland(grid, r, c - 1); 
        sinkIsland(grid, r, c + 1); 
    }
}
