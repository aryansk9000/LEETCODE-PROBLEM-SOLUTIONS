class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n = grid.length;
        long N = n * n;
        long SN = (N * (N + 1)) / 2;
        long S2N = (N * (N + 1) * (2 * N + 1)) / 6;
        long S = 0, S2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                S += grid[i][j];
                S2 += (long) grid[i][j] * grid[i][j];
            }
        }

        long val1 = S - SN;
        long val2 = S2 - S2N;

        val2 = val2 / val1;

        long x = (val1 + val2) / 2; 
        long y = x - val1;          

        return new int[]{(int) x, (int) y};
    }
}
