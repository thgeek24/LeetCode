/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e257;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * LeetCode 257
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/04 13:20
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        } else {
            String node = String.valueOf(root.val);
            List<String> paths = new ArrayList<>();

            List<String> leftPath = binaryTreePaths(root.left);
            List<String> rightPath = binaryTreePaths(root.right);

            leftPath.forEach(item -> paths.add(node + "->" + item));
            rightPath.forEach(item -> paths.add(node + "->" + item));

            if (paths.isEmpty()) {
                paths.add(node);
            }
            return paths;
        }
    }
}
