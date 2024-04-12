/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * Expecting:
 * before unpark
 * after unpark
 * before park
 * after park
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/12 15:44
 */
public class MyThread3Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 myThread = new MyThread3(Thread.currentThread());
        myThread.start();

        Thread.sleep(1000);
        System.out.println("before park");
        LockSupport.park("ParkAndUnparkDemo");
        System.out.println("after park");
    }
}
