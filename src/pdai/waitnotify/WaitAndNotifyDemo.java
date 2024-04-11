/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.waitnotify;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/11 15:31
 */
public class WaitAndNotifyDemo {
    /**
     * Expecting:
     * before wait
     * before notify
     * after notify
     * after wait
     *
     * @param args
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        synchronized (myThread) {
            try {
                myThread.start();
                // 主线程睡眠3s
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + ": before wait");
                // 阻塞主线程
                myThread.wait();
                System.out.println(Thread.currentThread().getName() + ": after wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
