/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m71;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SimplifyPath}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/29 11:25
 */
class SimplifyPathTest {
    private SimplifyPath test;

    @BeforeEach
    void setUp() {
        test = new SimplifyPath();
    }

    @Test
    void test1() {
        String path = "/home/";
        String expected = "/home";
        assertEquals(expected, test.simplifyPath(path));
    }

    @Test
    void test2() {
        String path = "/home//foo/";
        String expected = "/home/foo";
        assertEquals(expected, test.simplifyPath(path));
    }

    @Test
    void test3() {
        String path = "/home/user/Documents/../Pictures";
        String expected = "/home/user/Pictures";
        assertEquals(expected, test.simplifyPath(path));
    }

    @Test
    void test4() {
        String path = "/../";
        String expected = "/";
        assertEquals(expected, test.simplifyPath(path));
    }

    @Test
    void test5() {
        String path = "/.../a/../b/c/../d/./";
        String expected = "/.../b/d";
        assertEquals(expected, test.simplifyPath(path));
    }
}