/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link CountNumbersWithUniqueDigits_357}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/27 17:10
 */
class CountNumbersWithUniqueDigits_357Test {
    private CountNumbersWithUniqueDigits_357 test;

    @BeforeEach
    void setUp() {
        test = new CountNumbersWithUniqueDigits_357();
    }

    @Test
    void equalsNinetyOne() {
        assertEquals(91, test.countNumbersWithUniqueDigits(2));
    }

    @Test
    void equalsOne() {
        assertEquals(1, test.countNumbersWithUniqueDigits(0));
    }
}