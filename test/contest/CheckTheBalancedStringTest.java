/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test ofr {@link CheckTheBalancedString}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/03 12:04
 */
class CheckTheBalancedStringTest {
    private CheckTheBalancedString test;

    @BeforeEach
    void setUp() {
        test = new CheckTheBalancedString();
    }

    @Test
    void isFalse() {
        String num = "1234";
        assertFalse(test.isBalanced(num));
    }

    @Test
    void isTrue() {
        String num = "24123";
        assertTrue(test.isBalanced(num));
    }
}