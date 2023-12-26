/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 234
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/26 11:09
 */
public class PalindromeLinkedList_234 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode slowPrev = null;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;

            ListNode temp = slow;
            slow = slow.next;
            temp.next = slowPrev;
            slowPrev = temp;
        }

        ListNode left;
        ListNode right;
        if (fast.next == null) {
            left = slowPrev;
            right = slow.next;
        } else {
            // fast.next.next == null
            right = slow.next;

            left = slow;
            slow.next = slowPrev;
        }

        while (left != null && right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
