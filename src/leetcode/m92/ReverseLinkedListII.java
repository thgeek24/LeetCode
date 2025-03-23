/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m92;

import leetcode.ListNode;

/**
 * LeetCode 92
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/23 08:59
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int currPos = 1;
        ListNode prev = null;
        ListNode curr = head;
        while (currPos < left) {
            prev = curr;
            curr = curr.next;
            currPos++;
        }

        ListNode nodeAfterRight = getNodeByPos(curr, currPos, right + 1);
        ListNode reversed = reverse(null, curr, currPos, right);
        ListNode resHead;
        if (prev == null) {
            resHead = reversed;
        } else {
            resHead = head;
            prev.next = reversed;
        }
        while (reversed.next != null) {
            reversed = reversed.next;
        }
        reversed.next = nodeAfterRight;

        return resHead;
    }

    private ListNode getNodeByPos(ListNode curr, int currPos, int targetPos) {
        if (curr == null) {
            return null;
        }
        if (currPos == targetPos) {
            return curr;
        }
        return getNodeByPos(curr.next, currPos + 1, targetPos);
    }

    private ListNode reverse(ListNode prev, ListNode curr, int currPos, int endPos) {
        if (currPos == endPos) {
            curr.next = prev;
            return curr;
        }
        ListNode next = curr.next;
        curr.next = prev;
        return reverse(curr, next, currPos + 1, endPos);
    }
}
