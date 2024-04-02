/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.concurrent.Semaphore;

/**
 * LeetCode 1114
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/02 11:43
 */
public class PrintInOrder_1114 {
    private final Semaphore runSecond;

    private final Semaphore runThird;

    public PrintInOrder_1114() { // Rename it to Foo to match the code on LeetCode
        runSecond = new Semaphore(0);
        runThird = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        runSecond.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        runSecond.acquire();
        printSecond.run();
        runThird.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        runThird.acquire();
        printThird.run();
    }
}
