/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m984;

/**
 * LeetCode 984
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/12 10:32
 */
public class StringWithoutAAAOrBBB {
    public String strWithout3a3b(int a, int b) {
        int[][] count = new int[2][1];
        count[0][0] = a;
        count[1][0] = b;

        StringBuilder sb = new StringBuilder();
        while (count[0][0] != 0 || count[1][0] != 0) {
            if (count[0][0] == 0) {
                for (int i = 0; i < count[1][0]; i++) {
                    sb.append('b');
                }
                break;
            }

            if (count[1][0] == 0) {
                for (int i = 0; i < count[0][0]; i++) {
                    sb.append('a');
                }
                break;
            }

            if (count[0][0] > count[1][0]) {
                sb.append("aab");
                count[0][0] -= 2;
                count[1][0]--;
                continue;
            }

            if (count[1][0] > count[0][0]) {
                sb.append("bba");
                count[0][0]--;
                count[1][0] -= 2;
                continue;
            }


            if (sb.length() == 0 || sb.charAt(sb.length() - 1) == 'b') {
                sb.append("ab");
            } else {
                sb.append("ba");
            }
            count[0][0]--;
            count[1][0]--;
        }

        return sb.toString();
    }

}
