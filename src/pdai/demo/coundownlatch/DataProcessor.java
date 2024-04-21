/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.coundownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * Demo for {@link java.util.concurrent.CountDownLatch}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/21 15:14
 */
public class DataProcessor {
    private final int processorNum = 5;
    private final CountDownLatch latch = new CountDownLatch(processorNum);

    public void startTasks() {
        for (int i = 0; i < processorNum; i++) {
            new Thread(new Worker(this.latch)).start();
        }
    }

    public void finalizeTasks() {
        try {
            latch.await();
            System.out.println("All tasks finished.");
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }
    }

    private static class Worker implements Runnable {
        private final CountDownLatch latch;

        public Worker(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            processTask();
            latch.countDown();
        }

        private void processTask() {
            System.out.println(Thread.currentThread().getName() + " worker started.");
        }
    }
}
