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
 * @since 2024/03/01 18:16
 */
class MinimumASCIIDeleteSumForTwoStrings_712Test {
    MinimumASCIIDeleteSumForTwoStrings_712 test;

    @BeforeEach
    void setUp() {
        test = new MinimumASCIIDeleteSumForTwoStrings_712();
    }

    @Test
    void equalsTwoThreeOne() {
        String s1 = "sea";
        String s2 = "eat";
        assertEquals(231, test.minimumDeleteSum(s1, s2));
    }

    @Test
    void equalsFourZeroThree() {
        String s1 = "delete";
        String s2 = "leet";
        assertEquals(403, test.minimumDeleteSum(s1, s2));
    }
}