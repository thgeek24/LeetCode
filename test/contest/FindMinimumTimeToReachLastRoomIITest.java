/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/03 11:45
 */
class FindMinimumTimeToReachLastRoomIITest {
    private FindMinimumTimeToReachLastRoomII test;

    @BeforeEach
    void setUp() {
        test = new FindMinimumTimeToReachLastRoomII();
    }

    @Test
    void equalsSeven() {
        int[][] nums = {{0, 4}, {4, 4}};
        assertEquals(7, test.minTimeToReach(nums));
    }

    @Test
    void equalsSix() {
        int[][] nums = {{0, 0, 0, 0}, {0, 0, 0, 0}};
        assertEquals(6, test.minTimeToReach(nums));
    }
}