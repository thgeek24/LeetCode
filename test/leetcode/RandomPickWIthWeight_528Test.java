/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RandomPickWIthWeight_528}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/15 08:40
 */
class RandomPickWIthWeight_528Test {
    private RandomPickWIthWeight_528.Solution test;

    @Test
    void test1() {
        int[] w = {1};
        test = new RandomPickWIthWeight_528.Solution(w);
        assertEquals(0, test.pickIndex());
    }
}