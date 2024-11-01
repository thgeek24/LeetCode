/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m443;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link StringCompression}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/01 08:20
 */
class StringCompressionTest {
    private StringCompression test;

    @BeforeEach
    void setUp() {
        test = new StringCompression();
    }

    @Test
    void equalsSix() {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] compressedChars = {'a', '2', 'b', '2', 'c', '3'};
        int expected = 6;
        assertEquals(expected, test.compress(chars));
        for (int i = 0; i < compressedChars.length; i++) {
            assertEquals(compressedChars[i], chars[i]);
        }
    }

    @Test
    void equalsOne() {
        char[] chars = {'a'};
        char[] compressedChars = {'a'};
        int expected = 1;
        assertEquals(expected, test.compress(chars));
        for (int i = 0; i < compressedChars.length; i++) {
            assertEquals(compressedChars[i], chars[i]);
        }
    }

    @Test
    void equalsFour() {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        char[] compressedChars = {'a', 'b', '1', '2'};
        int expected = 4;
        assertEquals(expected, test.compress(chars));
        for (int i = 0; i < compressedChars.length; i++) {
            assertEquals(compressedChars[i], chars[i]);
        }
    }

    @Test
    void equalsSix2() {
        char[] chars = {'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        char[] compressedChars = {'a', '3', 'b', '2', 'a', '2'};
        int expected = 6;
        assertEquals(expected, test.compress(chars));
        for (int i = 0; i < compressedChars.length; i++) {
            assertEquals(compressedChars[i], chars[i]);
        }
    }
}