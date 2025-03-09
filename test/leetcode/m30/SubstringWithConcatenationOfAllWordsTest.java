/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m30;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ArrayUtils;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SubstringWithConcatenationOfAllWords}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/07 11:18
 */
class SubstringWithConcatenationOfAllWordsTest {
    private SubstringWithConcatenationOfAllWords test;

    @BeforeEach
    void setUp() {
        test = new SubstringWithConcatenationOfAllWords();
    }

    @Test
    void test1() {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> expected = ArrayUtils.convert(new Integer[]{0, 9});
        assertEquals(expected, test.findSubstring(s, words));
    }

    @Test
    void test2() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};
        List<Integer> expected = ArrayUtils.convert(new Integer[]{});
        assertEquals(expected, test.findSubstring(s, words));
    }

    @Test
    void test3() {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar", "foo", "the"};
        List<Integer> expected = ArrayUtils.convert(new Integer[]{6, 9, 12});
        assertEquals(expected, test.findSubstring(s, words));
    }

    @Test
    void test4() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "good"};
        List<Integer> expected = ArrayUtils.convert(new Integer[]{8});
        assertEquals(expected, test.findSubstring(s, words));
    }

    @Test
    void test5() {
        String s = "aaaaaaaaaaaaaa";
        String[] words = {"aa", "aa"};
        List<Integer> expected = ArrayUtils.convert(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        List<Integer> actual = test.findSubstring(s, words).stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);
    }
}