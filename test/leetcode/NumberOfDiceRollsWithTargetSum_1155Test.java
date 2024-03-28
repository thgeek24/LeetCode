/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link NumberOfDiceRollsWithTargetSum_1155}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/28 11:09
 */
class NumberOfDiceRollsWithTargetSum_1155Test {
    private NumberOfDiceRollsWithTargetSum_1155 test;

    @BeforeEach
    void setUp() {
        test = new NumberOfDiceRollsWithTargetSum_1155();
    }

    @Test
    void equalsOne() {
        assertEquals(1, test.numRollsToTarget(1, 6, 3));
    }

    @Test
    void equalsSix() {
        assertEquals(6, test.numRollsToTarget(2, 6, 7));
    }

    @Test
    void shouldEqual() {
        assertEquals(222616187, test.numRollsToTarget(30, 30, 500));
    }
}