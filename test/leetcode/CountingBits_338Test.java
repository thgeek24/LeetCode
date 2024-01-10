/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test for {@link CountingBits_338}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/08 14:22
 */
class CountingBits_338Test {
    private List<CountingBits_338> tests;
    private final int[] expectedBitsInTwo = {0, 1, 1};
    private final int[] expectedBitsInFive = {0, 1, 1, 2, 1, 2};

    @BeforeEach
    void setUp() {
        tests = Arrays.asList(new CountingBits_338.Solution1(),
                new CountingBits_338.Solution2());
    }

    @Test
    void countForTwo() {
        for (CountingBits_338 test : tests) {
            int[] bitsInTwo = test.countBits(2);
            assertArrayEquals(expectedBitsInTwo, bitsInTwo);
        }
    }

    @Test
    void countForFive() {
        for (CountingBits_338 test : tests) {
            int[] bitsInFive = test.countBits(5);
            assertArrayEquals(expectedBitsInFive, bitsInFive);
        }
    }
}