/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * Expecting:
 * "Thread is going to park."
 * "Thread is unparked."
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/11 17:55
 */
public class LockSupportDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread.sleep(1000);

        System.out.println("Main thread will unpark the child thread.");
        LockSupport.unpark(myThread);
    }
}
