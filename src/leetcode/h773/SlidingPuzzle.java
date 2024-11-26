/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h773;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * LeetCode 773
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/25 10:32
 */
public class SlidingPuzzle {
    public int slidingPuzzle(int[][] board) {
        String target = "123450"; // Target configuration
        String start = "";        // Start configuration as a string

        // Convert the input board to a string representation
        for (int[] row : board) {
            for (int num : row) {
                start += num;
            }
        }

        // Define valid moves for each position in the string
        int[][] neighbors = {
                {1, 3},    // 0 can move to 1, 3
                {0, 2, 4}, // 1 can move to 0, 2, 4
                {1, 5},    // 2 can move to 1, 5
                {0, 4},    // 3 can move to 0, 4
                {1, 3, 5}, // 4 can move to 1, 3, 5
                {2, 4}     // 5 can move to 2, 4
        };

        // Queue for BFS
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        // Initialize BFS
        queue.offer(start);
        visited.add(start);
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            // Process all nodes at the current level
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                if (current.equals(target)) {
                    return steps; // Found the solution
                }

                // Find the position of '0' (empty slot)
                int zeroIndex = current.indexOf('0');

                // Generate all possible moves
                for (int neighbor : neighbors[zeroIndex]) {
                    String next = swap(current, zeroIndex, neighbor);
                    if (!visited.contains(next)) {
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }
            steps++; // Increment step count after processing all nodes at this level
        }

        return -1; // No solution
    }

    // Helper method to swap characters in a string
    private String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}
