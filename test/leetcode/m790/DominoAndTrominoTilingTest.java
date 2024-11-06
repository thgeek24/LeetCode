/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m790;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link DominoAndTrominoTiling}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 20:56
 */
class DominoAndTrominoTilingTest {
    private DominoAndTrominoTiling test;

    @BeforeEach
    void setUp() {
        test = new DominoAndTrominoTiling();
    }

    @Test
    void equalsFive() {
        int n = 3;
        assertEquals(5, test.numTilings(n));
    }

    @Test
    void equalsOne() {
        int n = 1;
        assertEquals(1, test.numTilings(n));
    }
}