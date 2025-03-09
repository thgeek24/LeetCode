/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m211;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link DesignAddAndSearchWordsDataStructure}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/16 09:51
 */
class DesignAddAndSearchWordsDataStructureTest {
    private DesignAddAndSearchWordsDataStructure.WordDictionary test;

    @BeforeEach
    void setUp() {
        test = new DesignAddAndSearchWordsDataStructure.WordDictionary();
    }

    @Test
    void test1() {
        test.addWord("bad");
        test.addWord("dad");
        test.addWord("mad");
        assertFalse(test.search("pad")); // return False
        assertTrue(test.search("bad")); // return True
        assertFalse(test.search("ba")); // return False
        assertTrue(test.search(".ad")); // return True
        assertTrue(test.search("b..")); // return True
    }


    @Test
    void test2() {
        test.addWord("a");
        test.addWord("ab");
        assertTrue(test.search("a")); // return True
        assertTrue(test.search("a.")); // return True
    }
}