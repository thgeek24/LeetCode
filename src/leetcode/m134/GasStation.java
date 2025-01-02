/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m134;

/**
 * LeetCode 134
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/02 10:20
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;   // Tracks the overall balance of gas.
        int currTank = 0;    // Tracks the current tank balance as we traverse.
        int startStation = 0; // The starting station index.

        for (int i = 0; i < gas.length; i++) {
            int balance = gas[i] - cost[i];
            totalTank += balance; // Accumulate the overall balance.
            currTank += balance;  // Accumulate the current route balance.

            // If current tank is negative, reset the start index.
            if (currTank < 0) {
                startStation = i + 1; // Set the next station as the starting point.
                currTank = 0;         // Reset the current tank.
            }
        }

        // If the total gas is less than total cost, it is impossible to complete the route.
        return totalTank >= 0 ? startStation : -1;
    }
}
