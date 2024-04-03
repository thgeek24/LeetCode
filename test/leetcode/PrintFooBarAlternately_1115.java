/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.concurrent.Semaphore;

/**
 * LeetCode 1115
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/03 10:46
 */
public class PrintFooBarAlternately_1115 {
    private final int n;
    private final Semaphore fooSemaphore;
    private final Semaphore barSemaphore;

    public PrintFooBarAlternately_1115(int n) { // rename this constructor to FooBar to match with LeetCode
        this.n = n;
        fooSemaphore = new Semaphore(1);
        barSemaphore = new Semaphore(0);
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            fooSemaphore.acquire();
            printFoo.run();
            barSemaphore.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            barSemaphore.acquire();
            printBar.run();
            fooSemaphore.release();
        }
    }
}
