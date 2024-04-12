/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * Thread that uses LockSupport
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/11 17:02
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is going to park.");
        LockSupport.park();
        System.out.println("Thread is unparked.");
    }
}
