package leetcode;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2023/11/26 17:31
 */
public class PathSumIII_437 {
    // 分为互斥的三种情况：1）路径从根节点值开始 2）路径从左节点值开始 3）路径从右节点值开始
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int rootSum = count(root, targetSum);
        int leftSum = pathSum(root.left, targetSum);
        int rightSum = pathSum(root.right, targetSum);
        return rootSum + leftSum + rightSum;
    }

    // 包含传入结点的k值
    private int count(TreeNode root, long targetSum) {
        if (root == null) {
            return 0;
        }
        int rootCount = root.val == targetSum ? 1 : 0;
        int leftCount = count(root.left, targetSum - root.val);
        int rightCount = count(root.right, targetSum - root.val);
        return rootCount + leftCount + rightCount;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
