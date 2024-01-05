/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link BulbSwitcher_319}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/05 10:49
 */
class BulbSwitcher_319Test {
    private BulbSwitcher_319 test;

    @BeforeEach
    void setUp() {
        test = new BulbSwitcher_319();
    }

    @Test
    void zeroBulbs() {
        int zero = test.bulbSwitch(0);
        assertEquals(0, zero);
    }

    @Test
    void oneBulb() {
        int one = test.bulbSwitch(1);
        assertEquals(1, one);
    }

    @Test
    void sevenBulbs() {
        int two = test.bulbSwitch(7);
        assertEquals(2, two);
    }
}