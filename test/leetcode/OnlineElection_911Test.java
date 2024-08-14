/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link OnlineElection_911}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/14 10:59
 */
class OnlineElection_911Test {
    private OnlineElection_911.TopVotedCandidate test;

    @Test
    void test1() {
        int[] persons = {0, 0, 1, 1, 2};
        int[] times = {0, 67, 69, 74, 87};
        test = new OnlineElection_911.TopVotedCandidate(persons, times);
        assertEquals(1, test.q(100));
    }
}