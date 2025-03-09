/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m984;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link StringWithoutAAAOrBBB}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/12 10:33
 */
class StringWithoutAAAOrBBBTest {
    private StringWithoutAAAOrBBB test;

    @BeforeEach
    void setUp() {
        test = new StringWithoutAAAOrBBB();
    }

    @Test
    void test1() {
        int a = 1;
        int b = 2;
        Set<String> expected = Arrays.stream(new String[]{"abb", "bab", "bba"})
                .collect(Collectors.toSet());
        String actual = test.strWithout3a3b(a, b);
        assertTrue(expected.contains(actual));
    }

    @Test
    void test2() {
        int a = 4;
        int b = 1;
        assertEquals("aabaa", test.strWithout3a3b(a, b));
    }
}