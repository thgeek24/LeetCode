/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Demo for logger
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/16 15:25
 */
public class LoggerSystem {
    private final LinkedBlockingQueue<String> queue;
    private final Thread consumerThread;
    private volatile boolean shutdownRequested = false;

    public LoggerSystem(int capacity) {
        this.queue = new LinkedBlockingQueue<>(capacity);
        this.consumerThread = new Thread(this::process);
    }

    public void start() {
        consumerThread.start();
    }

    public void log(String message) {
        queue.add(message);
    }

    private void process() {
        while (!shutdownRequested || !queue.isEmpty()) {
            try {
                String msg = queue.poll(1, TimeUnit.MILLISECONDS);
                if (msg != null) {
                    System.out.println(msg);
                }
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void shutdown() throws InterruptedException {
        shutdownRequested = true;
        consumerThread.join();
    }

    public static void main(String[] args) throws InterruptedException {
        LoggerSystem logger = new LoggerSystem(10);
        logger.start();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int index = i;
            Thread thread = new Thread(() -> {
                logger.log("This is thread-" + index);
            });
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        logger.shutdown();
    }
}
