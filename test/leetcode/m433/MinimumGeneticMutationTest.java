/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m433;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MinimumGeneticMutation}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/14 09:12
 */
class MinimumGeneticMutationTest {
    private MinimumGeneticMutation test;

    @BeforeEach
    void setUp() {
        test = new MinimumGeneticMutation();
    }

    @Test
    void equalsOne() {
        String startGene = "AACCGGTT";
        String endGene = "AACCGGTA";
        String[] bank = {"AACCGGTA"};
        int expected = 1;
        assertEquals(expected, test.minMutation(startGene, endGene, bank));
    }

    @Test
    void equalsTwo() {
        String startGene = "AACCGGTT";
        String endGene = "AAACGGTA";
        String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        int expected = 2;
        assertEquals(expected, test.minMutation(startGene, endGene, bank));
    }
}