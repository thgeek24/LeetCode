/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m208;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link Trie}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/15 10:38
 */
class TrieTest {
    private Trie trie;

    @BeforeEach
    void setUp() {
        trie = new Trie();
    }

    @Test
    void test1() {
        trie.insert("apple");
        assertTrue(trie.search("apple"));   // return True
        assertFalse(trie.search("app"));     // return False
        assertTrue(trie.startsWith("app")); // return True
        trie.insert("app");
        assertTrue(trie.search("app"));   // return True
    }

    @Test
    void test2() {
        trie.insert("a");
        assertTrue(trie.search("a"));   // return True
        assertTrue(trie.startsWith("a")); // return True
    }
}