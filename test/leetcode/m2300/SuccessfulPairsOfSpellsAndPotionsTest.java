/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test for {@link SuccessfulPairsOfSpellsAndPotions}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 16:31
 */
class SuccessfulPairsOfSpellsAndPotionsTest {
    private SuccessfulPairsOfSpellsAndPotions test;

    @BeforeEach
    void setUp() {
        test = new SuccessfulPairsOfSpellsAndPotions();
    }

    @Test
    void test1() {
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        int success = 7;
        int[] expected = {4, 0, 3};
        assertArrayEquals(expected, test.successfulPairs(spells, potions, success));
    }

    @Test
    void test2() {
        int[] spells = {3, 1, 2};
        int[] potions = {8, 5, 8};
        int success = 16;
        int[] expected = {2, 0, 2};
        assertArrayEquals(expected, test.successfulPairs(spells, potions, success));
    }
}