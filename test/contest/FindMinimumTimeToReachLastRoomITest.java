/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/03 10:54
 */
class FindMinimumTimeToReachLastRoomITest {
    private FindMinimumTimeToReachLastRoomI test;

    @BeforeEach
    void setUp() {
        test = new FindMinimumTimeToReachLastRoomI();
    }

    @Test
    void equalsSix() {
        int[][] nums = {{0, 4}, {4, 4}};
        assertEquals(6, test.minTimeToReach(nums));
    }

    @Test
    void equalsSeventyTwo() {
        int[][] nums = {{94, 79, 62, 27, 69, 84}, {6, 32, 11, 82, 42, 30}};
        assertEquals(72, test.minTimeToReach(nums));
    }
}