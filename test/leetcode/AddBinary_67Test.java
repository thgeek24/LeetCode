/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link AddBinary_67}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/23 18:34
 */
class AddBinary_67Test {
    private AddBinary_67 test;

    @BeforeEach
    void setUp() {
        test = new AddBinary_67();
    }

    @Test
    void test2() {
        String a = "1010";
        String b = "1011";
        String actual = test.addBinary(a, b);
        assertEquals("10101", actual);
    }
}