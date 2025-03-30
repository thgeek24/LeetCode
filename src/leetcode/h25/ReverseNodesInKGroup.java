/*
 * Copyright (c) 2023-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.h25;

import leetcode.ListNode;

/**
 * LeetCode 25
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/20 15:31
 */
public interface ReverseNodesInKGroup {
    ListNode reverseKGroup(ListNode head, int k);

    class Solution1 implements ReverseNodesInKGroup {
        @Override
        public ListNode reverseKGroup(ListNode head, int k) {
            return auxReverseKGroup(head, k, k);
        }

        private ListNode auxReverseKGroup(ListNode head, int k, int remaining) {
            if (isLessThanK(head, remaining)) {
                return head;
            }
            ListNode _head = remaining == 1 ? auxReverseKGroup(head.next, k, k)
                    : auxReverseKGroup(head.next, k, remaining - 1);
            if (remaining == 1) {
                head.next = _head;
                return head;
            }
            ListNode _second = head.next.next;
            head.next.next = head;
            head.next = _second;
            return _head;
        }

        private boolean isLessThanK(ListNode head, int k) {
            while (k > 0 && head != null) {
                head = head.next;
                k--;
            }
            return k > 0;
        }
    }

    class Solution2 implements ReverseNodesInKGroup {
        @Override
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null) return null;
            // 区间 [a, b) 包含 k 个待反转元素
            ListNode a, b;
            a = b = head;
            for (int i = 0; i < k; i++) {
                // 不足 k 个，不需要反转，base case
                if (b == null) return head;
                b = b.next;
            }
            // 反转前 k 个元素
            ListNode newHead = reverse(a, b);
            // 递归反转后续链表并连接起来
            a.next = reverseKGroup(b, k);
            return newHead;
        }

        /**
         * 反转区间 [a, b) 的元素，注意是左闭右开
         */
        private ListNode reverse(ListNode a, ListNode b) {
            ListNode pre, cur, nxt;
            pre = null;
            cur = a;
            nxt = a;
            // while 终止的条件改一下就行了
            while (cur != b) {
                nxt = cur.next;
                cur.next = pre;
                pre = cur;
                cur = nxt;
            }
            // 返回反转后的头结点
            return pre;
        }
    }

    class Solution3 implements ReverseNodesInKGroup {
        @Override
        public ListNode reverseKGroup(ListNode head, int k) {
            int len = 0;
            ListNode curr = head;
            while (curr != null) {
                len++;
                curr = curr.next;
            }

            int groupTotal = len / k;
            ListNode resHead = null;
            ListNode prev = null;
            ListNode tempCurr = null;
            curr = head;
            for (int i = 0; i < groupTotal; i++) {
                tempCurr = getNodeAt(curr, 0, k);
                ListNode reversed = reverse(null, curr, 1, k);
                if (resHead == null) {
                    resHead = reversed;
                }
                if (prev != null) {
                    prev.next = reversed;
                }
                while (reversed.next != null) {
                    reversed = reversed.next;
                }
                prev = reversed;
                curr = tempCurr;
            }
            if (prev != null) {
                prev.next = curr;
            }

            return resHead;
        }

        private ListNode reverse(ListNode prev, ListNode curr, int currCount, int endCount) {
            if (currCount == endCount) {
                curr.next = prev;
                return curr;
            }
            ListNode next = curr.next;
            curr.next = prev;
            return reverse(curr, next, currCount + 1, endCount);
        }

        private ListNode getNodeAt(ListNode curr, int currIndex, int targetIndex) {
            if (currIndex == targetIndex) {
                return curr;
            }
            return getNodeAt(curr.next, currIndex + 1, targetIndex);
        }
    }
}
