/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m274;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link HIndex}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/18 09:03
 */
class HIndexTest {
    private HIndex test;

    @BeforeEach
    void setUp() {
        test = new HIndex();
    }

    @Test
    void equalsThree() {
        int[] citations = {3, 0, 6, 1, 5};
        assertEquals(3, test.hIndex(citations));
    }

    @Test
    void equalsOne() {
        int[] citations = {1, 3, 1};
        assertEquals(1, test.hIndex(citations));
    }
}