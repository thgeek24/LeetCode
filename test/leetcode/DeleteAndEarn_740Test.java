/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link DeleteAndEarn_740}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/17 09:45
 */
class DeleteAndEarn_740Test {
    private DeleteAndEarn_740 test;

    @BeforeEach
    void setUp() {
        test = new DeleteAndEarn_740();
    }

    @Test
    void earnSix() {
        int[] nums = {3, 4, 2};
        int six = test.deleteAndEarn(nums);
        assertEquals(6, six);
    }

    @Test
    void earnNine() {
        int[] nums = {2, 2, 3, 3, 3, 4};
        int nine = test.deleteAndEarn(nums);
        assertEquals(9, nine);
    }
}