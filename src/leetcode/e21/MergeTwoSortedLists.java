/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e21;

import leetcode.ListNode;

/**
 * LeetCode 21
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/20 08:18
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                curr.next = new ListNode(list2.val);
                curr = curr.next;
                list2 = list2.next;
                continue;
            }

            if (list2 == null) {
                curr.next = new ListNode(list1.val);
                curr = curr.next;
                list1 = list1.next;
                continue;
            }

            if (list1.val < list2.val) {
                curr.next = new ListNode(list1.val);
                curr = curr.next;
                list1 = list1.next;
            } else {
                curr.next = new ListNode(list2.val);
                curr = curr.next;
                list2 = list2.next;
            }
        }
        return dummy.next;
    }
}