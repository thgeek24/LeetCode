/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link AssignCookies_455}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/23 10:57
 */
class AssignCookies_455Test {
    private AssignCookies_455 test;

    @BeforeEach
    void setUp() {
        test = new AssignCookies_455();
    }

    @Test
    void equalsOne() {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        assertEquals(1, test.findContentChildren(g, s));
    }

    @Test
    void equalsTwo() {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        assertEquals(2, test.findContentChildren(g, s));
    }
}