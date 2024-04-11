/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.waitnotify;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/11 15:24
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + ": before notify");
            notify();
            System.out.println(Thread.currentThread().getName() + ": after notify");
        }
    }
}
