/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.exchanger;

import java.util.Random;
import java.util.concurrent.Exchanger;

/**
 * Demo for {@link java.util.concurrent.Exchanger}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/27 11:13
 */
public class ConcurrencyConversionSystem {
    private static final Exchanger<Double> exchanger = new Exchanger<>();

    private static class Producer implements Runnable {
        @Override
        public void run() {
            Random random = new Random();
            Double rate;
            try {
                for (int i = 0; i < 10; i++) {
                    Double usd = 100.0 + random.nextDouble() * 900.0; // Generate USD amount
                    System.out.println("Producer: Sending USD " + usd);
                    // Send USD and receive exchange rate
                    rate = exchanger.exchange(usd);
                    System.out.println("Producer: exchanged rate received: " + rate);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private static class Consumer implements Runnable {
        @Override
        public void run() {
            Double rate = 0.85;  // Initial exchange rate
            try {
                for (int i = 0; i < 10; i++) {
                    // Receive USD and calculate EUR
                    Double usd = exchanger.exchange(rate);
                    double eur = usd * rate;
                    System.out.println("Consumer: Converted " + usd + " USD to " + eur + " EUR at rate " + rate);
                    // Update rate randomly
                    rate += (Math.random() - 0.5) * 0.1;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }
}
