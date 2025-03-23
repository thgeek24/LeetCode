/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m38;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link CountAndSay}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/11 08:44
 */
class CountAndSayTest {
    private CountAndSay test;

    @BeforeEach
    void setUp() {
        test = new CountAndSay();
    }

    @Test
    void test1() {
        int n = 4;
        String expected = "1211";
        assertEquals(expected, test.countAndSay(n));
    }

    @Test
    void test2() {
        int n = 1;
        String expected = "1";
        assertEquals(expected, test.countAndSay(n));
    }
}