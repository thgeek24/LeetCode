/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link HIndexII_275}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/11 10:36
 */
class HIndexII275Test {
    private HIndexII_275 test;

    @BeforeEach
    void setUp() {
        test = new HIndexII_275();
    }

    @Test
    void equalsThree() {
        int[] citations = {0, 1, 3, 5, 6};
        assertEquals(3, test.hIndex(citations));
    }

    @Test
    void equalsTwo() {
        int[] citations = {1, 2, 100};
        assertEquals(2, test.hIndex(citations));
    }

    @Test
    void equalsTwo2() {
        int[] citations = {11, 15};
        assertEquals(2, test.hIndex(citations));
    }

    @Test
    void equalsOne() {
        int[] citations = {1};
        assertEquals(1, test.hIndex(citations));
    }

    @Test
    void equalsOne2() {
        int[] citations = {0, 1};
        assertEquals(1, test.hIndex(citations));
    }

    @Test
    void equalsOne3() {
        int[] citations = {1, 2};
        assertEquals(1, test.hIndex(citations));
    }

    @Test
    void equalsZero() {
        int[] citations = {0};
        assertEquals(0, test.hIndex(citations));
    }
}