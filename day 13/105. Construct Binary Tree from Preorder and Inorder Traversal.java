class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
  
        Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inOrderIndexMap.put(inorder[i], i);
        }
        return buildSubTree(preorder, inOrderIndexMap, 0, 0, inorder.length - 1);
    }

    private TreeNode buildSubTree(int[] preorder, Map<Integer, Integer> inOrderIndexMap,
                                  int rootIndex, int left, int right) {
        if (left > right || rootIndex >= preorder.length) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[rootIndex]);

        int mid = inOrderIndexMap.get(preorder[rootIndex]);

        if (mid > left) {
            root.left = buildSubTree(preorder, inOrderIndexMap,
                    rootIndex + 1, left, mid - 1);
        }

        if (mid < right) {
            root.right = buildSubTree(preorder, inOrderIndexMap,
                    rootIndex + (mid - left) + 1, mid + 1, right);
        }

        return root;
    }
}
