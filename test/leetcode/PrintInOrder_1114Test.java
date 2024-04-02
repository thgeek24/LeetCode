/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test for {@link PrintInOrder_1114}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/02 11:54
 */
class PrintInOrder_1114Test {
    private PrintInOrder_1114 test;

    private final Thread threadA = new Thread(() -> {
        try {
            test.first(() -> System.out.print("first"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    private final Thread threadB = new Thread(() -> {
        try {
            test.second(() -> System.out.print("second"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    private final Thread threadC = new Thread(() -> {
        try {
            test.third(() -> System.out.print("third"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    @BeforeEach
    void setUp() {
        test = new PrintInOrder_1114();
    }

    @Test
    void test1() throws InterruptedException {
//        int[] nums = {1, 2, 3};
        threadA.start();
        threadB.start();
        threadC.start();
    }

    @Test
    void test2() throws InterruptedException {
//        int[] nums = {1, 3, 2};
        threadA.start();
        threadC.start();
        threadB.start();
    }
}