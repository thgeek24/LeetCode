/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1339
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/25 15:32
 */
public class MaximumProductOfSplittedBinaryTree_1339 {
    private final int mod = 1_000_000_007;
    private long totalSum = 0;
    private long maxProduct = 0;

    public int maxProduct(TreeNode root) {
        totalSum = dfsTotalSum(root);
        dfsMaxProduct(root);
        return (int) (maxProduct % mod);
    }

    private long dfsTotalSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + dfsTotalSum(root.left) + dfsTotalSum(root.right);
    }

    private long dfsMaxProduct(TreeNode root) {
        if (root == null) {
            return 0;
        }
        long sum = root.val + dfsMaxProduct(root.left) + dfsMaxProduct(root.right);
        maxProduct = Math.max(maxProduct, sum * (totalSum - sum));
        return sum;
    }
}
