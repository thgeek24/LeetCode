/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.phaser;

import java.util.concurrent.Phaser;

/**
 * Demo for {@link java.util.concurrent.Phaser}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/25 17:51
 */
public class GameSimulation {
    public Phaser getPhaser() {
        return phaser;
    }

    private final Phaser phaser;

    public GameSimulation() {
        this.phaser = new Phaser(1);  // Initially, the main thread is the only party
    }

    public void startLevel(int level) {
        int numPlayers = (int) (Math.random() * 10) + 1;  // Random number of players join at each level
        System.out.println("Level " + level + " starting with " + numPlayers + " players.");

        // Register new players to the Phaser
        phaser.bulkRegister(numPlayers);

        for (int i = 0; i < numPlayers; i++) {
            new Thread(new Player(i, level)).start();
        }

        // Deregister main thread and wait for players to complete the level
        phaser.arriveAndAwaitAdvance();
        System.out.println("Level " + level + " completed.");
    }

    class Player implements Runnable {
        private final int id;
        private final int level;

        Player(int id, int level) {
            this.id = id;
            this.level = level;
        }

        @Override
        public void run() {
            System.out.println("Player " + id + " at level " + level + " started.");
            // Simulate doing tasks
            try {
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            // Signal completion of the level
            phaser.arriveAndDeregister();
            System.out.println("Player " + id + " at level " + level + " finished.");
        }
    }
}
