/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link IsSubsequence_392}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/05 12:00
 */
class IsSubsequence_392Test {
    private List<IsSubsequence_392> solutions;

    @BeforeEach
    void setUp() {
        solutions = Arrays.asList(
                new IsSubsequence_392.Solution1(),
                new IsSubsequence_392.Solution2());
    }

    @Test
    void isSubsequence() {
        String s = "abc";
        String t = "ahbgdc";
        for (IsSubsequence_392 solution : solutions) {
            assertTrue(solution.isSubsequence(s, t));
        }
    }

    @Test
    void isNotSubsequence() {
        String s = "axc";
        String t = "ahbgdc";
        for (IsSubsequence_392 solution : solutions) {
            assertFalse(solution.isSubsequence(s, t));
        }
    }
}