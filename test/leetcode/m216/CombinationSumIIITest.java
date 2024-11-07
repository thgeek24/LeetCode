/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m216;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link CombinationSumIII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 18:31
 */
class CombinationSumIIITest {
    private CombinationSumIII test;

    @BeforeEach
    void setUp() {
        test = new CombinationSumIII();
    }

    @Test
    void test1() {
        int k = 3;
        int n = 7;
        List<List<Integer>> expected = Collections.singletonList(Arrays.asList(1, 2, 4));
        assertEquals(expected, test.combinationSum3(k, n));
    }

    @Test
    void test2() {
        int k = 3;
        int n = 9;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2, 6),
                Arrays.asList(1, 3, 5),
                Arrays.asList(2, 3, 4));
        assertEquals(expected, test.combinationSum3(k, n));
    }

    @Test
    void test3() {
        int k = 4;
        int n = 1;
        List<List<Integer>> expected = Collections.emptyList();
        assertEquals(expected, test.combinationSum3(k, n));
    }

    @Test
    void test4() {
        int k = 2;
        int n = 18;
        List<List<Integer>> expected = Collections.emptyList();
        assertEquals(expected, test.combinationSum3(k, n));
    }
}