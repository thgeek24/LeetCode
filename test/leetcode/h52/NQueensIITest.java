/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h52;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link NQueensII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/20 11:21
 */
class NQueensIITest {
    private NQueensII test;

    @BeforeEach
    void setUp() {
        test = new NQueensII();
    }

    @Test
    void equalsTwo() {
        assertEquals(2, test.totalNQueens(4));
    }

    @Test
    void equalsOne() {
        assertEquals(1, test.totalNQueens(1));
    }
}