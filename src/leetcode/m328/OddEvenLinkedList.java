/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m328;

import leetcode.ListNode;

/**
 * LeetCode 328
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 16:13
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        final ListNode evenHead = head.next;

        ListNode curr = head;
        while (curr != null && curr.next != null) {
            ListNode currEven = curr.next;
            ListNode nextOdd = currEven.next;
            curr.next = nextOdd;
            curr = nextOdd;
            if (nextOdd != null) {
                currEven.next = nextOdd.next;
            }
        }

        ListNode odd = head;
        while (odd.next != null) {
            odd = odd.next;
        }
        odd.next = evenHead;
        return head;
    }

}
