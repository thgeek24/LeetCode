/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * LeetCode 347
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/09 09:53
 */
public class TopKFrequentElements {
    private static class Element {
        int key;
        int count;

        public Element(int key, int count) {
            this.key = key;
            this.count = count;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }
        PriorityQueue<Element> queue = new PriorityQueue<>((o1, o2) -> o2.count - o1.count);
        map.forEach((key, val) -> queue.offer(new Element(key, val)));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            Element elem = queue.poll();
            res[i] = elem.key;
        }

        return res;
    }
}
