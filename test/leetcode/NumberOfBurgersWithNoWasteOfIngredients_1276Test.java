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
 * Test for {@link NumberOfBurgersWithNoWasteOfIngredients_1276}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/26 10:32
 */
class NumberOfBurgersWithNoWasteOfIngredients_1276Test {
    private NumberOfBurgersWithNoWasteOfIngredients_1276 test;

    @BeforeEach
    void setUp() {
        test = new NumberOfBurgersWithNoWasteOfIngredients_1276();
    }

    @Test
    void test1() {
        int tomatoSlices = 16;
        int cheeseSlices = 7;
        List<Integer> expected = Arrays.asList(1, 6);
        assertEquals(expected, test.numOfBurgers(tomatoSlices, cheeseSlices));
    }

    @Test
    void test2() {
        int tomatoSlices = 17;
        int cheeseSlices = 4;
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, test.numOfBurgers(tomatoSlices, cheeseSlices));
    }

    @Test
    void test3() {
        int tomatoSlices = 4;
        int cheeseSlices = 17;
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, test.numOfBurgers(tomatoSlices, cheeseSlices));
    }

    @Test
    void test4() {
        int tomatoSlices = 2385088;
        int cheeseSlices = 164763;
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, test.numOfBurgers(tomatoSlices, cheeseSlices));
    }
}