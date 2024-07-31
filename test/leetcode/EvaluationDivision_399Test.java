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
 * Test for {@link EvaluationDivision_399}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/27 09:47
 */
class EvaluationDivision_399Test {
    private EvaluationDivision_399 test;

    @BeforeEach
    void setUp() {
        test = new EvaluationDivision_399();
    }

    @Test
    void test1() {
        List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "c"));
        double[] values = {2.0, 3.0};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "c"),
                Arrays.asList("b", "a"),
                Arrays.asList("a", "e"),
                Arrays.asList("a", "a"),
                Arrays.asList("x", "x"));

        double[] expected = {6.00000, 0.50000, -1.00000, 1.00000, -1.00000};
        double[] actual = test.calcEquation(equations, values, queries);

        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"),
                Arrays.asList("b", "c"),
                Arrays.asList("bc", "cd"));
        double[] values = {1.5, 2.5, 5.0};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "c"),
                Arrays.asList("c", "b"),
                Arrays.asList("bc", "cd"),
                Arrays.asList("cd", "bc"));

        double[] expected = {3.75000, 0.40000, 5.00000, 0.20000};
        double[] actual = test.calcEquation(equations, values, queries);

        assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        List<List<String>> equations = Collections.singletonList(Arrays.asList("a", "b"));
        double[] values = {0.5};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "b"),
                Arrays.asList("b", "a"),
                Arrays.asList("a", "c"),
                Arrays.asList("x", "y"));

        double[] expected = {0.50000, 2.00000, -1.00000, -1.00000};
        double[] actual = test.calcEquation(equations, values, queries);

        assertArrayEquals(expected, actual);
    }

    @Test
    void test4() {
        List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"),
                Arrays.asList("c", "d"));
        double[] values = {1.0, 1.0};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "c"),
                Arrays.asList("b", "d"),
                Arrays.asList("b", "a"),
                Arrays.asList("d", "c"));

        double[] expected = {-1.0, -1.0, 1.00000, 1.00000};
        double[] actual = test.calcEquation(equations, values, queries);

        assertArrayEquals(expected, actual);
    }
}