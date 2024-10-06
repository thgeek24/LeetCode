/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m380;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * LeetCode 380
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/19 09:15
 */
public class RandomizedSet {
    private final List<Integer> nums;
    private final Map<Integer, Integer> indexMap;
    private final Random random;

    public RandomizedSet() {
        this.nums = new ArrayList<>();
        this.indexMap = new HashMap<>();
        this.random = new Random();
    }

    public boolean insert(int val) {
        if (indexMap.containsKey(val)) {
            return false;
        }
        nums.add(val);
        indexMap.put(val, nums.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) {
            return false;
        }
        int index = indexMap.get(val);
        int lastVal = nums.get(nums.size() - 1);
        nums.set(index, lastVal);
        indexMap.put(lastVal, index);
        nums.remove(nums.size() - 1);
        indexMap.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get((random.nextInt(nums.size())));
    }
}
