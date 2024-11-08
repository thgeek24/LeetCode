/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package support;

import leetcode.TreeNode;

/**
 * Utils to compare two {@link leetcode.TreeNode}s
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/07 13:51
 */
public class TreeNodeComparator {
    public static boolean equals(TreeNode treeNode1, TreeNode treeNode2) {
        if (treeNode1 == treeNode2) {
            return true;
        }
        if (treeNode1 == null || treeNode2 == null) {
            return false;
        }
        if (treeNode1.val != treeNode2.val) {
            return false;
        }
        return equals(treeNode1.left, treeNode2.left) && equals(treeNode1.right, treeNode2.right);
    }
}
