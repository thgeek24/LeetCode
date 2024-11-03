/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 3343
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/03 11:17
 */
public class CountNumberOfBalancedPermutations {
    public int countBalancedPermutations(String num) {
        List<Integer> nums = new ArrayList<>();
        char[] charArray = num.toCharArray();
        int sum = 0;
        for (char ch : charArray) {
            int n = ch - '0';
            sum += n;
            nums.add(n);
        }
        if (sum % 2 != 0) {
            return 0;
        }

        int target = sum / 2;


        return 0;
    }
}
