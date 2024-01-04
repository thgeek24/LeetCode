/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SatisfiabilityOfEqualityEquations_990}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/04 17:30
 */
class SatisfiabilityOfEqualityEquations_990Test {
    private SatisfiabilityOfEqualityEquations_990 test;

    @BeforeEach
    void setUp() {
        test = new SatisfiabilityOfEqualityEquations_990();
    }

    @Test
    void testNotEqual() {
        String[] equations = {"a==b", "b!=a"};
        assertFalse(test.equationsPossible(equations));
    }

    @Test
    void testEqual() {
        String[] equations = {"a==b", "b==a"};
        assertTrue(test.equationsPossible(equations));
    }
}