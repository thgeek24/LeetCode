/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link TimeNeededToInformAllEmployees_1376}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/05/29 09:18
 */
class TimeNeededToInformAllEmployees_1376Test {
    private TimeNeededToInformAllEmployees_1376 test;

    @BeforeEach
    void setUp() {
        test = new TimeNeededToInformAllEmployees_1376();
    }

    @Test
    void equalsZero() {
        int[] manager = {-1};
        int[] informTime = {0};
        int actual = test.numOfMinutes(1, 0, manager, informTime);
        assertEquals(0, actual);
    }

    @Test
    void equalsOne() {
        int[] manager = {2, 2, -1, 2, 2, 2};
        int[] informTime = {0, 0, 1, 0, 0, 0};
        int actual = test.numOfMinutes(6, 2, manager, informTime);
        assertEquals(1, actual);
    }
}