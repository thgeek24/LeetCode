/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h23;

import leetcode.ListNode;

import java.util.PriorityQueue;

/**
 * LeetCode 23
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/23 08:24
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (ListNode node : lists) {
            while (node != null) {
                queue.offer(node.val);
                node = node.next;
            }
        }

        ListNode head = null;
        ListNode res = null;
        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (head == null) {
                head = new ListNode(num);
                res = head;
            } else {
                head.next = new ListNode(num);
                head = head.next;
            }
        }

        return res;
    }
}
