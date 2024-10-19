/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m133;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/12 21:22
 */
class CloneGraphTest {
    private CloneGraph test;

    @BeforeEach
    void setUp() {
        test = new CloneGraph();
    }

    @Test
    void test1() {
        CloneGraph.Node one = new CloneGraph.Node(1);
        CloneGraph.Node two = new CloneGraph.Node(2);
        CloneGraph.Node three = new CloneGraph.Node(3);
        CloneGraph.Node four = new CloneGraph.Node(4);
        one.neighbors.addAll(Arrays.asList(two, four));
        two.neighbors.addAll(Arrays.asList(one, three));
        three.neighbors.addAll(Arrays.asList(two, four));
        four.neighbors.addAll(Arrays.asList(one, three));

        CloneGraph.Node node = test.cloneGraph(one);
    }

    @Test
    void test2() {
        CloneGraph.Node one = new CloneGraph.Node(1);
        CloneGraph.Node node = test.cloneGraph(one);
    }

    @Test
    void test3() {
        CloneGraph.Node one = null;
        CloneGraph.Node node = test.cloneGraph(one);
    }
}