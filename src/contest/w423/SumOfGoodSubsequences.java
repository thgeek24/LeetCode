/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w423;

/**
 * LeetCode 3351
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 11:36
 */
public class SumOfGoodSubsequences {
    public int sumOfGoodSubsequences(int[] nums) {
        long[] count = new long[100010];
        long[] total = new long[100010];
        long mod = 1000000007, res = 0;
        for (int num : nums) {
            // count of subsequences ending with num
            count[num + 1] = (count[num] + count[num + 1] + count[num + 2] + 1) % mod;
            // current sum of new subsequences after adding num
            long cur = total[num] + total[num + 2] + num * (count[num] + count[num + 2] + 1);
            // total sum of subsequences ending with num
            total[num + 1] = (total[num + 1] + cur) % mod;
            res = (res + cur) % mod;
        }
        return (int) res;
    }
}
