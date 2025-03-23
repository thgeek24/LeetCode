/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m2;

import leetcode.ListNode;

/**
 * LeetCode 2
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/18 08:32
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int temp = carry;
            if (l1 != null) {
                temp += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                temp += l2.val;
                l2 = l2.next;
            }
            if (temp >= 10) {
                carry = 1;
            } else {
                carry = 0;
            }
            curr.next = new ListNode(temp % 10);
            curr = curr.next;
        }
        if (carry == 1) {
            curr.next = new ListNode(1);
        }
        return dummy.next;
    }
}
