/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m135;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link Candy}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/20 09:09
 */
class CandyTest {
    private Candy test;

    @BeforeEach
    void setUp() {
        test = new Candy();
    }

    @Test
    void equalsFive() {
        int[] ratings = {1, 0, 2};
        int actual = test.candy(ratings);
        assertEquals(5, actual);
    }

    @Test
    void equalsFour() {
        int[] ratings = {1, 2, 2};
        int actual = test.candy(ratings);
        assertEquals(4, actual);
    }

    @Test
    void equalsSeven() {
        int[] ratings = {1, 3, 2, 2, 1};
        int actual = test.candy(ratings);
        assertEquals(7, actual);
    }
}