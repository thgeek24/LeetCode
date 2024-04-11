/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.waitnotify;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/11 15:31
 */
public class WaitAndNotifyDemo2 {
    /**
     * Expecting:
     * before notify
     * after notify
     * before wait
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(3000);
        synchronized (myThread) {
            try {
                System.out.println(Thread.currentThread().getName() + ": before wait");
                myThread.wait();
                System.out.println(Thread.currentThread().getName() + ": after wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}