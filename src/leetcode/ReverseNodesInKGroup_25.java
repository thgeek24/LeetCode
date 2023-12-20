/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 25
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/20 15:31
 */
public class ReverseNodesInKGroup_25 {
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

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ReverseNodesInKGroup_25 test = new ReverseNodesInKGroup_25();
        ListNode reversed = test.reverseKGroup(one, 3);
        System.out.println(reversed);
    }

    private boolean isLessThanK(ListNode head, int k) {
        while (k > 0 && head != null) {
            head = head.next;
            k--;
        }
        return k > 0;
    }
}
