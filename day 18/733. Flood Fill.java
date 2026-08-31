class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldColor = image[sr][sc];
        if (oldColor == color) {
            return image;
        }

        int m = image.length;
        int n = image[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr, sc});

        image[sr][sc] = color;

        int[][] directions = {
            {-1, 0}, // up
            {1, 0},  // down
            {0, -1}, // left
            {0, 1}   // right
        };

        while (!q.isEmpty()) {

            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];

            for (int[] dir : directions) {

                int nr = r + dir[0];
                int nc = c + dir[1];
                if (nr >= 0 && nr < m &&
                    nc >= 0 && nc < n &&
                    image[nr][nc] == oldColor) {

                    image[nr][nc] = color;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return image;
    }
}