/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package hsbc;

/**
 * 两个等长字符串，第一个固定，第二个可以左旋转或右旋转，
 * 左旋转指将第一个字符放到最后去，右旋转指将最后一个字符放到第一个位置去，
 * 求使用最小的旋转次数旋转第二个字符串，使两个字符串的公共前缀达到最长
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/09 18:06
 */
public class MinRotations {
    public int minRotations(String firstString, String secondString) {
        int len = firstString.length();
        String secondSecond = secondString + secondString;
        int maxPrefix = 0;
        int minRotations = 0;
        for (int k = 0; k < len; k++) {
            int currPrefix = 0;
            for (int i = 0; i < len; i++) {
                if (firstString.charAt(i) == secondSecond.charAt(i + k)) {
                    currPrefix++;
                } else {
                    break;
                }
            }
            int rotations = Math.min(k, len - k);
            if (maxPrefix < currPrefix) {
                maxPrefix = currPrefix;
                minRotations = rotations;
            } else if (maxPrefix == currPrefix) {
                minRotations = Math.min(minRotations, rotations);
            }
        }
        return minRotations;
    }
}