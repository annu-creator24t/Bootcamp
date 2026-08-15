class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        int row = 0;
        int col = 0;
        int index = 0;

        for (int d = 0; d < m + n - 1; d++) {

            if (d % 2 == 0) {
                while (row >= 0 && col < n) {
                    result[index++] = mat[row][col];
                    row--;
                    col++;
                }

                if (col == n) {
                    col--;
                    row += 2;
                } else {
                    row++;
                }

            } else {
                while (row < m && col >= 0) {
                    result[index++] = mat[row][col];
                    row++;
                    col--;
                }

                if (row == m) {
                    row--;
                    col += 2;
                } else {
                    col++;
                }
            }
        }

        return result;
    }
}