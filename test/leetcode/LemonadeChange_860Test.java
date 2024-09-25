/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/30 12:11
 */
class LemonadeChange_860Test {
    private LemonadeChange_860 test;

    @BeforeEach
    void setUp() {
        test = new LemonadeChange_860();
    }

    @Test
    void isTrue() {
        int[] bills = {5, 5, 5, 10, 20};
        assertTrue(test.lemonadeChange(bills));
    }

    @Test
    void isFalse() {
        int[] bills = {5, 5, 10, 10, 20};
        assertFalse(test.lemonadeChange(bills));
    }
}