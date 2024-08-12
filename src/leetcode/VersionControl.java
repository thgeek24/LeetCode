/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 278
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/12 09:40
 */

public class VersionControl {
    private final int firstBadVersion;

    public VersionControl(int firstBadVersion) {
        this.firstBadVersion = firstBadVersion;
    }

    boolean isBadVersion(int version) {
        return version >= firstBadVersion;
    }

    public static class FirstBadVersion_278 extends VersionControl {
        public FirstBadVersion_278(int firstBadVersion) {
            super(firstBadVersion);
        }

        public int firstBadVersion(int n) {
            int left = 1;
            int right = n;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (!isBadVersion(mid)) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left;
        }
    }
}
