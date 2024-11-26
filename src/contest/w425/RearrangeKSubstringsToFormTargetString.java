/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w425;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 3365
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/24 11:07
 */
public class RearrangeKSubstringsToFormTargetString {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int len = s.length() / k;
        for (int i = 0; i <= s.length() - len; i += len) {
            for (int j = i; j < i + len; j++) {
                sb.append(s.charAt(j));
            }
            int count = map.getOrDefault(sb.toString(), 0);
            map.put(sb.toString(), count + 1);
            sb.setLength(0);
        }
        for (int i = 0; i <= t.length() - len; i += len) {
            for (int j = i; j < i + len; j++) {
                sb.append(t.charAt(j));
            }
            int count = map.getOrDefault(sb.toString(), 0);
            if (count == 0) {
                return false;
            }
            map.put(sb.toString(), count - 1);
            sb.setLength(0);
        }

        return true;
    }
}
