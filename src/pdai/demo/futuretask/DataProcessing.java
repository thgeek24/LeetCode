/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.futuretask;

import java.security.SecureRandom;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * Demo for {@link java.util.concurrent.FutureTask}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/16 17:19
 */
public class DataProcessing {
    private final ExecutorService executor = Executors.newFixedThreadPool(3);

    private static class Task implements Callable<String> {
        private final String dataSource;

        public Task(String dataSource) {
            this.dataSource = dataSource;
        }

        @Override
        public String call() throws Exception {
            int delay = new SecureRandom().nextInt(4);
            TimeUnit.SECONDS.sleep(delay);
            return "Processed " + dataSource;
        }
    }


    private Future<String> doProcess(String dataSource, int delay) {
        return executor.submit(() -> {
            TimeUnit.SECONDS.sleep(delay);
            return "Processed " + dataSource;
        });
    }

    public void process() {
        FutureTask<String> task1 = new FutureTask<>(new Task("Data source 1"));
        FutureTask<String> task2 = new FutureTask<>(new Task("Data source 2"));
        FutureTask<String> task3 = new FutureTask<>(new Task("Data source 3"));

        task1.run();
        task2.run();
        task3.run();

        try {
            String res = task1.get() + task2.get() + task3.get();
            System.out.println("Aggregated result: " + res);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        DataProcessing dp = new DataProcessing();
        dp.process();
    }
}
