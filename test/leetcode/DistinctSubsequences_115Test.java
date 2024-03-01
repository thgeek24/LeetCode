/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/02/27 15:45
 */
class DistinctSubsequences_115Test {
    private DistinctSubsequences_115 test;

    @BeforeEach
    void setUp() {
        test = new DistinctSubsequences_115();
    }

    @Test
    void equalsThree() {
        String s = "rabbbit";
        String t = "rabbit";
        assertEquals(3, test.numDistinct(s, t));
    }

    @Test
    void equalsFive() {
        String s = "babgbag";
        String t = "bag";
        assertEquals(5, test.numDistinct(s, t));
    }
}