/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m649;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link Dota2Senate}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 14:37
 */
class Dota2SenateTest {
    private Dota2Senate test;

    @BeforeEach
    void setUp() {
        test = new Dota2Senate();
    }

    @Test
    void isRadiant() {
        String senate = "RD";
        String expected = "Radiant";
        assertEquals(expected, test.predictPartyVictory(senate));
    }

    @Test
    void isDir() {
        String senate = "RDD";
        String expected = "Dire";
        assertEquals(expected, test.predictPartyVictory(senate));
    }

    @Test
    void isDir2() {
        String senate = "DDRRR";
        String expected = "Dire";
        assertEquals(expected, test.predictPartyVictory(senate));
    }
}