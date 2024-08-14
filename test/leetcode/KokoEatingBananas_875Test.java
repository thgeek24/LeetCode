/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link KokoEatingBananas_875}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/05 14:46
 */
class KokoEatingBananas_875Test {
    private KokoEatingBananas_875 test;

    @BeforeEach
    void setUp() {
        test = new KokoEatingBananas_875();
    }

    @Test
    void equalsFour() {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        assertEquals(4, test.minEatingSpeed(piles, h));
    }

    @Test
    void equalsThirty() {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;
        assertEquals(30, test.minEatingSpeed(piles, h));
    }

    @Test
    void equalsTwentyThree() {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 6;
        assertEquals(23, test.minEatingSpeed(piles, h));
    }
}