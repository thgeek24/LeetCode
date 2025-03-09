/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link BagOfTokens_948}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/25 16:11
 */
class BagOfTokens_948Test {
    private BagOfTokens_948 test;

    @BeforeEach
    void setUp() {
        test = new BagOfTokens_948();
    }

    @Test
    void equalsZero() {
        int[] tokens = {100};
        int power = 50;
        assertEquals(0, test.bagOfTokensScore(tokens, power));
    }

    @Test
    void equalsOne() {
        int[] tokens = {200, 100};
        int power = 150;
        assertEquals(1, test.bagOfTokensScore(tokens, power));
    }

    @Test
    void equalsTwo() {
        int[] tokens = {100, 200, 300, 400};
        int power = 200;
        assertEquals(2, test.bagOfTokensScore(tokens, power));
    }
}