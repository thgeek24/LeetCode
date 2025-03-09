/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m735;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test for {@link AsteroidCollision}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 11:25
 */
class AsteroidCollisionTest {
    private AsteroidCollision test;

    @BeforeEach
    void setUp() {
        test = new AsteroidCollision();
    }

    @Test
    void test1() {
        int[] asteroids = {5, 10, -5};
        int[] expected = {5, 10};
        assertArrayEquals(expected, test.asteroidCollision(asteroids));
    }

    @Test
    void test2() {
        int[] asteroids = {8, -8};
        int[] expected = {};
        assertArrayEquals(expected, test.asteroidCollision(asteroids));
    }

    @Test
    void test3() {
        int[] asteroids = {10, 2, -5};
        int[] expected = {10};
        assertArrayEquals(expected, test.asteroidCollision(asteroids));
    }

    @Test
    void test4() {
        int[] asteroids = {10, 5, -100};
        int[] expected = {-100};
        assertArrayEquals(expected, test.asteroidCollision(asteroids));
    }

    @Test
    void test5() {
        int[] asteroids = {-2, -1, 1, 2};
        int[] expected = {-2, -1, 1, 2};
        assertArrayEquals(expected, test.asteroidCollision(asteroids));
    }

    @Test
    void test6() {
        int[] asteroids = {-2, -2, 1, -2};
        int[] expected = {-2, -2, -2};
        assertArrayEquals(expected, test.asteroidCollision(asteroids));
    }
}