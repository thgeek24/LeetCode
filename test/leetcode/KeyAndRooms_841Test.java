/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link KeyAndRooms_841}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/06/16 17:07
 */
class KeyAndRooms_841Test {
    private KeyAndRooms_841 test;

    @BeforeEach
    void setUp() {
        test = new KeyAndRooms_841();
    }

    @Test
    void equalsTrue() {
        List<List<Integer>> rooms = Arrays.asList(
                Collections.singletonList(1),
                Collections.singletonList(2),
                Collections.singletonList(3),
                Collections.emptyList());
        assertTrue(test.canVisitAllRooms(rooms));
    }

    @Test
    void equalsFalse() {
        List<List<Integer>> rooms = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(3, 0, 1),
                Collections.singletonList(2),
                Collections.singletonList(0));
        assertFalse(test.canVisitAllRooms(rooms));
    }
}