/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2130;

import leetcode.ListNode;

/**
 * LeetCode 2130
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 17:33
 */
public class MaximumTwinSumOfALinkedList {
    public int pairSum(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }

        int halfLen = len / 2;
        int[] sums = new int[halfLen];

        int i = 0;
        int max = Integer.MIN_VALUE;
        cur = head;
        while (i < halfLen) {
            sums[i] += cur.val;
            cur = cur.next;
            i++;
        }
        while (i < len) {
            int index = len - i - 1;
            sums[index] += cur.val;
            max = Math.max(max, sums[index]);
            cur = cur.next;
            i++;
        }

        return max;
    }
}
