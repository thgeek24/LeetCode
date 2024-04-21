/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Demo for {@link java.util.concurrent.CyclicBarrier}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/21 16:41
 */
public class DataProcessingPipeline {
    private final int parties;
    private final CyclicBarrier barrier;
    private final double[] data;

    public DataProcessingPipeline(double[] data) {
        parties = data.length / 100;
        int processors = Runtime.getRuntime().availableProcessors();
        this.barrier = new CyclicBarrier(processors, this::barrierAction);
        this.data = data;
    }

    public void barrierAction() {
        System.out.println(Thread.currentThread().getName() + " is taking barrier action.");
    }

    public void process() {
        for (int i = 0; i < parties; i++) {
            new Thread(new Worker(i)).start();
        }
    }

    private class Worker implements Runnable {
        private final int party;

        public Worker(int party) {
            this.party = party;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName()+": worker " + party + " started.");
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
