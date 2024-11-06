/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2336;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link SmallestInfiniteSet}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 10:29
 */
class SmallestInfiniteSetTest {
    private SmallestInfiniteSet test;

    @BeforeEach
    void setUp() {
        test = new SmallestInfiniteSet();
    }

    @Test
    void test() {
        test.addBack(2);
        assertEquals(1, test.popSmallest());
        assertEquals(2, test.popSmallest());
        assertEquals(3, test.popSmallest());
        test.addBack(1);
        assertEquals(1, test.popSmallest());
        assertEquals(4, test.popSmallest());
        assertEquals(5, test.popSmallest());
    }
}