/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

/**
 * LeetCode 1195
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/08 23:07
 */
public class FizzBuzzMultithreaded_1195 {
    private int n;
    private int num = 1;
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public FizzBuzzMultithreaded_1195(int n) {
        this.n = n;
    }

    private void waitForTurn(IntConsumer func, int target) throws InterruptedException {
        while (num <= n) {
            lock.lock();
            try {
                if (num > n) {
                    return;
                }

                boolean isFizz = num % 3 == 0;
                boolean isBuzz = num % 5 == 0;

                if (isFizz && isBuzz && target == 15
                        || isFizz && !isBuzz && target == 3
                        || !isFizz && isBuzz && target == 5
                        || !isFizz && !isBuzz && target == 0) {
                    func.accept(num);
                    num++;
                    condition.signalAll();
                } else {
                    condition.await();
                }
            } finally {
                lock.unlock();
            }
        }
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        waitForTurn(x -> printFizz.run(), 3);
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        waitForTurn(x -> printBuzz.run(), 5);
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        waitForTurn(x -> printFizzBuzz.run(), 15);
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        waitForTurn(printNumber, 0);
    }
}
