/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link BoatsToSavePeople_881}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/24 09:17
 */
class BoatsToSavePeople_881Test {
    private BoatsToSavePeople_881 test;

    @BeforeEach
    void setUp() {
        test = new BoatsToSavePeople_881();
    }

    @Test
    void equalsOne() {
        int[] people = {1, 2};
        int limit = 3;
        int actual = test.numRescueBoats(people, limit);
        assertEquals(1, actual);
    }

    @Test
    void equalsThree() {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        int actual = test.numRescueBoats(people, limit);
        assertEquals(3, actual);
    }

    @Test
    void equalsFour() {
        int[] people = {3, 5, 3, 4};
        int limit = 5;
        int actual = test.numRescueBoats(people, limit);
        assertEquals(4, actual);
    }
}