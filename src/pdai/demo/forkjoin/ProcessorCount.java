/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.forkjoin;

/**
 * Demonstrate how to get available processors in JVM
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/18 15:30
 */
public class ProcessorCount {
    public static void main(String[] args) {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("Processors: " + processors);
    }
}
