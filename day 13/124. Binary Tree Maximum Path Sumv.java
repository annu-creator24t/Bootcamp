class Solution {
    public int maxPathSum(TreeNode root) {
        int[] max = {Integer.MIN_VALUE};
        dfs(root, max);
        return max[0];
    }

    private int dfs(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, dfs(root.left, max));
        int right = Math.max(0, dfs(root.right, max));

        int currentPath = root.val + left + right;

        max[0] = Math.max(max[0], currentPath);

        return root.val + Math.max(left, right);
    }
}