/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m173;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 173
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/10 09:44
 */
public class BSTIterator {
    private final List<Integer> list;
    private int next = 0;

    public BSTIterator(TreeNode root) {
        this.list = convertToList(root);
    }

    public int next() {
        return list.get(next++);
    }

    public boolean hasNext() {
        return next < list.size();
    }

    private List<Integer> convertToList(TreeNode root) {
        if (root.left == null && root.right == null) {
            List<Integer> res = new ArrayList<>();
            res.add(root.val);
            return res;
        }
        if (root.left == null) {
            List<Integer> rightList = convertToList(root.right);
            List<Integer> res = new ArrayList<>();
            res.add(root.val);
            res.addAll(rightList);
            return res;
        }
        if (root.right == null) {
            List<Integer> leftList = convertToList(root.left);
            List<Integer> res = new ArrayList<>(leftList);
            res.add(root.val);
            return res;
        }
        List<Integer> leftList = convertToList(root.left);
        List<Integer> rightList = convertToList(root.right);
        List<Integer> res = new ArrayList<>(leftList);
        res.add(root.val);
        res.addAll(rightList);
        return res;
    }
}
