/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.Test;

/**
 * Test for {@link FizzBuzzMultithreaded_1195}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/09 10:14
 */
class FizzBuzzMultithreaded_1195Test {
    private FizzBuzzMultithreaded_1195 test;

    private final Thread threadA = new Thread(() -> {
        try {
            test.fizz(() -> System.out.print("fizz"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    private final Thread threadB = new Thread(() -> {
        try {
            test.buzz(() -> System.out.print("buzz"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    private final Thread threadC = new Thread(() -> {
        try {
            test.fizzbuzz(() -> System.out.print("fizzbuzz"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    private final Thread threadD = new Thread(() -> {
        try {
            test.number(System.out::print);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    @Test
    void testFifteen() {
        test = new FizzBuzzMultithreaded_1195(15);
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }

    @Test
    void testFive() {
        test = new FizzBuzzMultithreaded_1195(5);
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}