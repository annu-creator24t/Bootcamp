class Solution {
 public static int traversal(TreeNode root) {

 if(root == null){
            return 0;
        }
    int leftMax = traversal(root.left);
    int rightMax = traversal(root.right);

    int max = Math.max(leftMax, rightMax) + 1;
    return max;
    }
    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null){
            return 0;
        }
        int diam1 = diameterOfBinaryTree(root.left);
        int diam2 = diameterOfBinaryTree(root.right);
        int diam3 = traversal(root.left) + traversal(root.right);

        return Math.max(diam3, Math.max(diam1, diam2));
        
    }
}