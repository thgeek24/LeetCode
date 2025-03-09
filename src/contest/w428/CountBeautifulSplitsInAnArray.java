/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w428;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 3388
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/15 11:18
 */
public interface CountBeautifulSplitsInAnArray {
    int beautifulSplits(int[] nums);

    class Solution1 implements CountBeautifulSplitsInAnArray {
        @Override
        public int beautifulSplits(int[] nums) {
            if (nums.length < 3) {
                return 0;
            }

            Set<String> set = new HashSet<>();
            for (int left = 0; left < nums.length - 1; left++) {
                int right = left + 1;
                while (right < nums.length) {
                    if (isPrefix(nums, left, right)) {
                        if (left == 0) {
                            int midRight = right * 2 - left;
                            while (midRight < nums.length) {
                                set.add(right + "-" + midRight);
                                midRight++;
                            }
                        } else {
                            set.add(left + "-" + right);
                        }
                    }
                    right++;
                }
            }

            return set.size();
        }

        private boolean isPrefix(int[] nums, int left, int right) {
            if (left < 0 || right > nums.length - 1 || left >= right) {
                return false;
            }
            int i = left;
            int j = right;
            while (j < nums.length && i < right) {
                if (nums[i++] != nums[j++]) {
                    return false;
                }
            }
            return i == right;
        }
    }

    class Solution2 implements CountBeautifulSplitsInAnArray {
        @Override
        public int beautifulSplits(int[] nums) {
            int n = nums.length;
            if (n < 3) {
                return 0; // We need at least 3 elements to make a valid split
            }

            long mod = 1_000_000_007;
            long base = 31;

            // Compute prefix hashes
            long[] prefixHash = new long[n + 1]; // Hash for prefix [0..i)
            long[] pow = new long[n + 1]; // Store powers of base

            pow[0] = 1;
            for (int i = 0; i < n; i++) {
                pow[i + 1] = (pow[i] * base) % mod;
                prefixHash[i + 1] = (prefixHash[i] * base + nums[i]) % mod;
            }

            int count = 0;

            // Iterate over possible i and j such that 1 <= i < j < n
            for (int i = 1; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    boolean valid = false;

                    // Check if nums1 is a prefix of nums2
                    if (isPrefix(prefixHash, 0, i, i, j, mod, pow)) {
                        valid = true;
                    }

                    // Check if nums2 is a prefix of nums3
                    if (!valid && isPrefix(prefixHash, i, j, j, n, mod, pow)) {
                        valid = true;
                    }

                    if (valid) {
                        count++;
                    }
                }
            }

            return count;
        }

        // Helper function to compare hashes of two subarrays
        private boolean isPrefix(long[] hash, int start1, int end1, int start2, int end2, long mod, long[] pow) {
            int len1 = end1 - start1;
            int len2 = end2 - start2;

            if (len1 > len2) {
                return false;
            }

            long hash1 = (hash[end1] - (hash[start1] * pow[len1]) % mod + mod) % mod;
            long hash2 = (hash[start2 + len1] - (hash[start2] * pow[len1]) % mod + mod) % mod;

            return hash1 == hash2;
        }
    }
}
