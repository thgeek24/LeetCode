/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link Candy_135}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/20 09:09
 */
class Candy_135Test {
    private Candy_135 test;

    @BeforeEach
    void setUp() {
        test = new Candy_135();
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