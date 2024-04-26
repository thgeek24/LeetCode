/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.phaser;

/**
 * Main method for {@link GameSimulation}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/25 18:03
 */
public class GameSimulationDemo {
    public static void main(String[] args) {
        GameSimulation game = new GameSimulation();
        for (int level = 1; level <= 5; level++) {  // Five levels in the game
            game.startLevel(level);
        }
        game.getPhaser().arriveAndDeregister();  // Deregister main thread and allow termination
        System.out.println("Game finished.");
    }
}
