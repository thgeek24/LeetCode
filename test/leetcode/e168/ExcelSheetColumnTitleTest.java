/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e168;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ExcelSheetColumnTitle}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/14 11:52
 */
class ExcelSheetColumnTitleTest {
    private ExcelSheetColumnTitle test;

    @BeforeEach
    void setUp() {
        test = new ExcelSheetColumnTitle();
    }

    @Test
    void test1() {
        int columnNumber = 1;
        assertEquals("A", test.convertToTitle(columnNumber));
    }

    @Test
    void test2() {
        int columnNumber = 28;
        assertEquals("AB", test.convertToTitle(columnNumber));
    }

    @Test
    void test3() {
        int columnNumber = 701;
        assertEquals("ZY", test.convertToTitle(columnNumber));
    }
}