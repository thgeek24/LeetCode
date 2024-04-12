/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/12 15:23
 */
public class MyThread2Test {
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2(Thread.currentThread());
        myThread.start();
        System.out.println("before park");
        // 获取许可
        LockSupport.park("ParkAndUnparkDemo");
        System.out.println("after park");
    }
}
