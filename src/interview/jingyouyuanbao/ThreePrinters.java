/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package interview.jingyouyuanbao;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/30 11:06
 */
public class ThreePrinters {
    public static class SequentialPrinter {
        private final Lock lock = new ReentrantLock();
        private final Condition conditionA = lock.newCondition();
        private final Condition conditionB = lock.newCondition();
        private final Condition conditionC = lock.newCondition();
        private int turn = 1; // 1 for Thread A, 2 for Thread B, 3 for Thread C

        public void printA() throws InterruptedException {
            for (int i = 0; i < 5; i++) {
                lock.lock();
                try {
                    while (turn != 1) {
                        conditionA.await();
                    }
                    System.out.print("AA");
                    turn = 2;
                    conditionB.signal();
                } finally {
                    lock.unlock();
                }
            }
        }

        public void printB() throws InterruptedException {
            for (int i = 0; i < 5; i++) {
                lock.lock();
                try {
                    while (turn != 2) {
                        conditionB.await();
                    }
                    System.out.print("BBB");
                    turn = 3;
                    conditionC.signal();
                } finally {
                    lock.unlock();
                }
            }
        }

        public void printC() throws InterruptedException {
            for (int i = 0; i < 5; i++) {
                lock.lock();
                try {
                    while (turn != 3) {
                        conditionC.await();
                    }
                    System.out.println("CCCC");
                    turn = 1;
                    conditionA.signal();
                } finally {
                    lock.unlock();
                }
            }
        }

        public static void main(String[] args) {
            SequentialPrinter printer = new SequentialPrinter();

            Thread t1 = new Thread(() -> {
                try {
                    printer.printA();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });

            Thread t2 = new Thread(() -> {
                try {
                    printer.printB();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });

            Thread t3 = new Thread(() -> {
                try {
                    printer.printC();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });

            t1.start();
            t2.start();
            t3.start();
        }
    }
}
