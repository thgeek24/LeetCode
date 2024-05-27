/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link AccountsMerge_721}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/05/27 10:07
 */
class AccountsMerge_721Test {
    private AccountsMerge_721 test;

    private String[][] accounts1 = {{"John", "johnsmith@mail.com", "john_newyork@mail.com"},
            {"John", "johnsmith@mail.com", "john00@mail.com"},
            {"Mary", "mary@mail.com"},
            {"John", "johnnybravo@mail.com"}};

    private String[][] expected1 = {{"John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"},
            {"Mary", "mary@mail.com"},
            {"John", "johnnybravo@mail.com"}};

    private String[][] accounts2 = {{"Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe1@m.co"},
            {"Kevin", "Kevin3@m.co", "Kevin5@m.co", "Kevin0@m.co"},
            {"Ethan", "Ethan5@m.co", "Ethan4@m.co", "Ethan0@m.co"},
            {"Hanzo", "Hanzo3@m.co", "Hanzo1@m.co", "Hanzo0@m.co"},
            {"Fern", "Fern5@m.co", "Fern1@m.co", "Fern0@m.co"}};

    private String[][] expected2 = {{"Ethan", "Ethan0@m.co", "Ethan4@m.co", "Ethan5@m.co"},
            {"Gabe", "Gabe0@m.co", "Gabe1@m.co", "Gabe3@m.co"},
            {"Hanzo", "Hanzo0@m.co", "Hanzo1@m.co", "Hanzo3@m.co"},
            {"Kevin", "Kevin0@m.co", "Kevin3@m.co", "Kevin5@m.co"},
            {"Fern", "Fern0@m.co", "Fern1@m.co", "Fern5@m.co"}};

    @BeforeEach
    void setUp() {
        test = new AccountsMerge_721();
    }

    @Test
    void merge1() {
        List<List<String>> accounts = Arrays.stream(accounts1)
                .map(Arrays::asList)
                .collect(Collectors.toList());
        List<List<String>> actual = test.accountsMerge(accounts);
        List<List<String>> expected = convertToList(expected1);
        assertEquals(expected, actual);
    }

    @Test
    void merge2() {
        List<List<String>> accounts = Arrays.stream(accounts2)
                .map(Arrays::asList)
                .collect(Collectors.toList());
        List<List<String>> actual = test.accountsMerge(accounts);
        List<List<String>> expected = convertToList(expected2);
        assertEquals(expected, actual);
    }

    private <T> List<List<T>> convertToList(T[][] accounts) {
        return Arrays.stream(accounts)
                .map(Arrays::asList)
                .collect(Collectors.toList());
    }
}