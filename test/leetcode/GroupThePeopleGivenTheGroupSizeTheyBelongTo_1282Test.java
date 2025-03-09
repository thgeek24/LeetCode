/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link GroupThePeopleGivenTheGroupSizeTheyBelongTo_1282}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/06 15:58
 */
class GroupThePeopleGivenTheGroupSizeTheyBelongTo_1282Test {
    private GroupThePeopleGivenTheGroupSizeTheyBelongTo_1282 test;

    @BeforeEach
    void setUp() {
        test = new GroupThePeopleGivenTheGroupSizeTheyBelongTo_1282();
    }

    @Test
    void test1() {
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        List<List<Integer>> expected = Arrays.asList(Collections.singletonList(5),
                Arrays.asList(0, 1, 2),
                Arrays.asList(3, 4, 6));
        // It will fail. Testing logic needs to be fixed
        assertTrue(ListComparator.equals(expected, test.groupThePeople(groupSizes)));
    }

    @Test
    void test2() {
        int[] groupSizes = {2, 1, 3, 3, 3, 2};
        List<List<Integer>> expected = Arrays.asList(Collections.singletonList(1),
                Arrays.asList(0, 5),
                Arrays.asList(2, 3, 4));
        // It will fail. Testing logic needs to be fixed
        assertTrue(ListComparator.equals(expected, test.groupThePeople(groupSizes)));
    }
}