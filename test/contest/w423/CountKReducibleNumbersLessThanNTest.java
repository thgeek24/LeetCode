/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w423;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link CountKReducibleNumbersLessThanN}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/14 10:09
 */
class CountKReducibleNumbersLessThanNTest {
    private CountKReducibleNumbersLessThanN test;

    @BeforeEach
    void setUp() {
        test = new CountKReducibleNumbersLessThanN();
    }

    @Test
    void equalsThree() {
        String s = "111";
        int k = 1;
        int expected = 3;
        assertEquals(expected, test.countKReducibleNumbers(s, k));
    }

    @Test
    void equalsSix() {
        String s = "1000";
        int k = 2;
        int expected = 6;
        assertEquals(expected, test.countKReducibleNumbers(s, k));
    }

    @Test
    void equalsZero() {
        String s = "1";
        int k = 3;
        int expected = 0;
        assertEquals(expected, test.countKReducibleNumbers(s, k));
    }
}