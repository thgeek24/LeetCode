/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e383;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link RansomNote}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/07 21:56
 */
class RansomNoteTest {
    private RansomNote test;

    @BeforeEach
    void setUp() {
        test = new RansomNote();
    }

    @Test
    void isTrue() {
        String ransomNote = "aa";
        String magazine = "aab";
        assertTrue(test.canConstruct(ransomNote, magazine));
    }
}