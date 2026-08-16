class Solution {
    static final int MOD = 1_000_000_007;
    int[][][] dp;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new int[m][n][maxMove + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                java.util.Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(startRow, startColumn, maxMove, m, n);
    }

    private int solve(int row, int col, int moves, int m, int n) {

        if (row < 0 || row >= m || col < 0 || col >= n) {
            return 1;
        }
        if (moves == 0) {
            return 0;
        }
        if (dp[row][col][moves] != -1) {
            return dp[row][col][moves];
        }

        long ans = 0;

        ans += solve(row - 1, col, moves - 1, m, n);
        ans += solve(row + 1, col, moves - 1, m, n);
        ans += solve(row, col - 1, moves - 1, m, n);
        ans += solve(row, col + 1, moves - 1, m, n);

        dp[row][col][moves] = (int)(ans % MOD);

        return dp[row][col][moves];
    }
}