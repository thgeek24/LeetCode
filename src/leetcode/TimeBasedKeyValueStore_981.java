/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 981
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/12 14:13
 */
public class TimeBasedKeyValueStore_981 {
    public static class TimeMap {
        private final Map<String, List<String>> valueMap;
        private final Map<String, List<Integer>> timeMap;

        public TimeMap() {
            this.valueMap = new HashMap<>();
            this.timeMap = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            valueMap.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
            timeMap.computeIfAbsent(key, k -> new ArrayList<>()).add(timestamp);
        }

        public String get(String key, int timestamp) {
            if (!valueMap.containsKey(key)) {
                return "";
            }

            List<String> values = valueMap.get(key);
            List<Integer> times = timeMap.get(key);
            int left = 0;
            int right = times.size() - 1;
            int index = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (times.get(mid) == timestamp) {
                    index = mid;
                    break;
                } else if (times.get(mid) < timestamp) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (index != -1) {
                return values.get(index);
            }
            return left == 0 ? "" : values.get(left - 1);
        }
    }
}
