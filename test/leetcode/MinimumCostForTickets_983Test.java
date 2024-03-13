/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/11 14:58
 */
class MinimumCostForTickets_983Test {
    private MinimumCostForTickets_983 test;

    @BeforeEach
    void setUp() {
        test = new MinimumCostForTickets_983();
    }

    @Test
    void equalsEleven() {
        int[] days = {1, 4, 6, 7, 8, 20};
        int[] costs = {2, 7, 15};
        assertEquals(11, test.minCostTickets(days, costs));
    }

    @Test
    void equalsSeventeen() {
        int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31};
        int[] costs = {2, 7, 15};
        assertEquals(17, test.minCostTickets(days, costs));
    }
}