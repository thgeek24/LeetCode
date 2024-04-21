/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.coundownlatch;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/21 15:29
 */
public class DataProcessorDemo {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor();
        dataProcessor.startTasks();
        dataProcessor.finalizeTasks();
    }
}
