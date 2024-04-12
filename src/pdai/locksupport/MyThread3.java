/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/12 15:44
 */
public class MyThread3 extends Thread {
    private Thread object;

    public MyThread3(Thread object) {
        this.object = object;
    }

    @Override
    public void run() {
        System.out.println("before unpark");
        LockSupport.unpark(object);
        System.out.println("after unpark");
    }
}
