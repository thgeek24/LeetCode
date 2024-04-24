/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.phaser;

import java.util.concurrent.Phaser;

/**
 * Demo for {@link java.util.concurrent.Phaser}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/24 20:21
 */
public class DataProcessingPhaser {
    private final int maxThreads;
    private final Phaser phaser;

    public DataProcessingPhaser(int maxThreads) {
        this.maxThreads = maxThreads;
        this.phaser = new Phaser(maxThreads);
    }

    public void start() {
        for (int i = 0; i < maxThreads; i++) {
            new Thread(new Worker(this.phaser)).start();
        }
    }

    private static class Worker implements Runnable {
        private final Phaser phaser;

        public Worker(Phaser phaser) {
            this.phaser = phaser;
        }

        @Override
        public void run() {
            loadData();
            phaser.arriveAndAwaitAdvance();

            process();
            phaser.arriveAndAwaitAdvance();

            aggregate();
            phaser.arriveAndAwaitAdvance();
        }

        private void loadData() {
            System.out.println(Thread.currentThread().getName() + " is loading data");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        private void process() {
            System.out.println(Thread.currentThread().getName() + " is processing");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        private void aggregate() {
            System.out.println(Thread.currentThread().getName() + " is aggregating result");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
