/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.futuretask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
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

    private Future<String> doProcess(String dataSource, int delay) {
        return executor.submit(() -> {
            TimeUnit.SECONDS.sleep(delay);
            return "Processed " + dataSource;
        });
    }

    public void process() {
        Future<String> data1 = doProcess("Data source 1", 1);
        Future<String> data2 = doProcess("Data source 2", 2);
        Future<String> data3 = doProcess("Data source 3", 3);

        try {
            String res = data1.get() + data2.get() + data3.get();
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
