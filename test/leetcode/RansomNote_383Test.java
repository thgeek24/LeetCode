/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link RansomNote_383}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/07 21:56
 */
class RansomNote_383Test {
    private RansomNote_383 test;

    @BeforeEach
    void setUp() {
        test = new RansomNote_383();
    }

    @Test
    void isTrue() {
        String ransomNote = "aa";
        String magazine = "aab";
        assertTrue(test.canConstruct(ransomNote, magazine));
    }
}