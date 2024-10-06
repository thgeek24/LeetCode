/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h68;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link TextJustification}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/26 08:08
 */
class TextJustificationTest {
    private TextJustification test;

    @BeforeEach
    void setUp() {
        test = new TextJustification();
    }

    @Test
    void test1() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification." };
        int maxWidth = 16;
        List<String> expected = Arrays.asList("This    is    an",
                "example  of text",
                "justification.  ");
        assertEquals(expected, test.fullJustify(words, maxWidth));
    }

    @Test
    void test2() {
        String[] words = {"What", "must", "be", "acknowledgment", "shall", "be" };
        int maxWidth = 16;
        List<String> expected = Arrays.asList("What   must   be",
                "acknowledgment  ",
                "shall be        ");
        assertEquals(expected, test.fullJustify(words, maxWidth));
    }

    @Test
    void test3() {
        String[] words = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do" };
        int maxWidth = 20;
        List<String> expected = Arrays.asList("Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  ");
        assertEquals(expected, test.fullJustify(words, maxWidth));
    }

    @Test
    void test4() {
        String[] words = {"ask", "not", "what", "your", "country", "can", "do", "for", "you", "ask", "what", "you", "can", "do", "for", "your", "country" };
        int maxWidth = 16;
        List<String> expected = Arrays.asList("ask   not   what",
                "your country can",
                "do  for  you ask",
                "what  you can do",
                "for your country");
        assertEquals(expected, test.fullJustify(words, maxWidth));
    }
}