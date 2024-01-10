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
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/09 15:40
 */
class PascalsTriangleII_119Test {
    private PascalsTriangleII_119 test;
    private final List<Integer> rowThree = Arrays.asList(1, 3, 3, 1);
    private final List<Integer> rowZero = Collections.singletonList(1);
    private final List<Integer> rowOne = Arrays.asList(1, 1);

    @BeforeEach
    void setUp() {
        test = new PascalsTriangleII_119();
    }

    @Test
    void rowThree() {
        List<Integer> row = test.getRow(3);
        assertEquals(rowThree.size(), row.size());
        for (int i = 0; i < row.size(); i++) {
            assertEquals(rowThree.get(i), row.get(i));
        }
    }

    @Test
    void rowZero() {
        List<Integer> row = test.getRow(0);
        assertEquals(rowZero.size(), row.size());
        for (int i = 0; i < row.size(); i++) {
            assertEquals(rowZero.get(i), row.get(i));
        }
    }

    @Test
    void rowOne() {
        List<Integer> row = test.getRow(1);
        assertEquals(rowOne.size(), row.size());
        for (int i = 0; i < row.size(); i++) {
            assertEquals(rowOne.get(i), row.get(i));
        }
    }
}