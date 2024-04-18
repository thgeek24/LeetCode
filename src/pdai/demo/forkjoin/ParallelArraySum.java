/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.forkjoin;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * Demo for {@link ForkJoinTask}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/18 15:54
 */
public class ParallelArraySum extends RecursiveTask<Long> {
    private final int[] array;

    private final int start;

    private final int end;

    private final int threshold = 1000;

    public ParallelArraySum(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= threshold) {
            System.out.println(Thread.currentThread().getName() + " is running - start: " + start + " end: " + end);
            long sum = 0L;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            int mid = start + (end - start) / 2;
            ParallelArraySum left = new ParallelArraySum(array, start, mid);
            ParallelArraySum right = new ParallelArraySum(array, mid, end);
            left.fork();
            Long rightResult = right.compute();
            Long leftResult = left.join();
            return leftResult + rightResult;
        }
    }
}
