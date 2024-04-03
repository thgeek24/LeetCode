/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.Test;

/**
 * Test for {@link PrintFooBarAlternately_1115}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/03 10:50
 */
class PrintFooBarAlternately_1115Test {
    private PrintFooBarAlternately_1115 test;

    private final Thread threadA = new Thread(() -> {
        try {
            test.foo(() -> System.out.print("foo"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    private final Thread threadB = new Thread(() -> {
        try {
            test.bar(() -> System.out.print("bar"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    @Test
    void test1() throws InterruptedException {
        test = new PrintFooBarAlternately_1115(1);
        threadA.start();
        threadB.start();
    }

    @Test
    void test2() throws InterruptedException {
        test = new PrintFooBarAlternately_1115(2);
        threadA.start();
        threadB.start();
    }
}