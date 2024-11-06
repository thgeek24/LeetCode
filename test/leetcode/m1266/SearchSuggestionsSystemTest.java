/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1266;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link SearchSuggestionsSystem}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 22:54
 */
class SearchSuggestionsSystemTest {
    private SearchSuggestionsSystem test;

    @BeforeEach
    void setUp() {
        test = new SearchSuggestionsSystem();
    }

    @Test
    void test1() {
        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";
        List<List<String>> expected = Arrays.asList(Arrays.asList("mobile", "moneypot", "monitor"),
                Arrays.asList("mobile", "moneypot", "monitor"),
                Arrays.asList("mouse", "mousepad"),
                Arrays.asList("mouse", "mousepad"),
                Arrays.asList("mouse", "mousepad"));
        assertEquals(expected, test.suggestedProducts(products, searchWord));
    }

    @Test
    void test2() {
        String[] products = {"havana"};
        String searchWord = "havana";
        List<List<String>> expected = Arrays.asList(Collections.singletonList("havana"),
                Collections.singletonList("havana"),
                Collections.singletonList("havana"),
                Collections.singletonList("havana"),
                Collections.singletonList("havana"),
                Collections.singletonList("havana"));
        assertEquals(expected, test.suggestedProducts(products, searchWord));
    }
}