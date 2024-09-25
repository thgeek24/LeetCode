/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link PartitionLabels_763}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/01 11:43
 */
class PartitionLabels_763Test {
    private PartitionLabels_763 test;

    @BeforeEach
    void setUp() {
        test = new PartitionLabels_763();
    }

    @Test
    void test1() {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> expected = Arrays.asList(9, 7, 8);
        assertTrue(ListComparator.equals(expected, test.partitionLabels(s)));
    }

    @Test
    void test2() {
        String s = "eccbbbbdec";
        List<Integer> expected = Collections.singletonList(10);
        assertTrue(ListComparator.equals(expected, test.partitionLabels(s)));
    }
}