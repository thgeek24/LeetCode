/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/03 11:50
 */
class CountNumberOfBalancedPermutationsTest {
    private CountNumberOfBalancedPermutations test;

    @BeforeEach
    void setUp() {
        test = new CountNumberOfBalancedPermutations();
    }

    @Test
    void equalsTwo() {
        String num = "123";
        assertEquals(2, test.countBalancedPermutations(num));
    }

    @Test
    void equalsOne() {
        String num = "112";
        assertEquals(1, test.countBalancedPermutations(num));
    }

    @Test
    void equalsZero() {
        String num = "12345";
        assertEquals(0, test.countBalancedPermutations(num));
    }
}