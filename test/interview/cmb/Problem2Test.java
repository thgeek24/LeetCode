/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package interview.cmb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link Problem2}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/08 09:19
 */
class Problem2Test {
    private Problem2 test;

    @BeforeEach
    void setUp() {
        test = new Problem2();
    }

    @Test
    void test1() {
        String str1 = "hello word";
        String str2 = "hallo wood";
        String expected = "llo wo";
        assertEquals(expected, test.longestCommonStr(str1, str2));
    }
}