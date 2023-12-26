/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author taohong on 03/09/2018
 */
public class MaximumDepthOfBinaryTreeTest {
    TreeNode tn1 = new TreeNode(1);
    MaximumDepthOfBinaryTree md = new MaximumDepthOfBinaryTree();

    @Test
    public void maxDepthTest1() {
        assertEquals(true, md.maxDepth(tn1) == 1);
    }

    @Test
    public void maxDepthTest2() {
        tn1.left = new TreeNode(2);
        assertEquals(true, md.maxDepth(tn1) == 2);
    }

    @Test
    public void maxDepthTest3() {
        assertEquals(false, md.maxDepth(tn1) == 3);
    }

    @Test
    public void maxDepthTest4() {
        assertEquals(true, md.maxDepth(tn1.right) == 0);
    }

    @Test
    public void maxDepthTest5() {
        assertEquals(false, md.maxDepth(tn1.right) == 1);
    }
}