/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w422;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/03 11:50
 */
class CountNumberOfBalancedPermutationsTest {
    private List<CountNumberOfBalancedPermutations> tests;

    @BeforeEach
    void setUp() {
        tests = CountNumberOfBalancedPermutations.getSolutions();
    }

    @Test
    void equalsTwo() {
        String num = "123";
        tests.forEach(test -> assertEquals(2, test.countBalancedPermutations(num)));
    }

    @Test
    void equalsOne() {
        String num = "112";
        tests.forEach(test -> assertEquals(1, test.countBalancedPermutations(num)));
    }

    @Test
    void equalsZero() {
        String num = "12345";
        tests.forEach(test -> assertEquals(0, test.countBalancedPermutations(num)));
    }

    @Test
    void equalsOne2() {
        String num = "11";
        tests.forEach(test -> assertEquals(1, test.countBalancedPermutations(num)));
    }

    @Test
    void equalsEight() {
        String num = "1234";
        tests.forEach(test -> assertEquals(8, test.countBalancedPermutations(num)));
    }

    @Test
    void equalsTwo2() {
        String num = "022";
        tests.forEach(test -> assertEquals(2, test.countBalancedPermutations(num)));
    }

    @Test
    void equalsFour() {
        String num = "6468";
        tests.forEach(test -> assertEquals(4, test.countBalancedPermutations(num)));
    }

    @Test
    void equalsFour2() {
        String num = "5353";
        tests.forEach(test -> assertEquals(4, test.countBalancedPermutations(num)));
    }

    @Test
    void equalsEighteen() {
        String num = "82060";
        tests.forEach(test -> assertEquals(18, test.countBalancedPermutations(num)));
    }

    @Test
    void test10() {
        String num = "96509861244547846";
        tests.forEach(test -> assertEquals(851350267, test.countBalancedPermutations(num)));
    }

    @Test
    void test11() {
        String num = "302203690210148694";
        tests.forEach(test -> assertEquals(215265033, test.countBalancedPermutations(num)));
    }

    @Test
    void test12() {
        String num = "37046348965010176474024426793";
        tests.forEach(test -> assertEquals(781134809, test.countBalancedPermutations(num)));
    }

    @Test
    void test13() {
        String num = "08961788077437553919640382583325637";
        tests.forEach(test -> assertEquals(144920189, test.countBalancedPermutations(num)));
    }

    @Test
    void test14() {
        String num = "065205342078235853809042321274683214";
        tests.forEach(test -> assertEquals(801579916, test.countBalancedPermutations(num)));
    }

    @Test
    void test15() {
        String num = "08961788077437553919640382583325637";
        tests.forEach(test -> assertEquals(144920189, test.countBalancedPermutations(num)));
    }
}