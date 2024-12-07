/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package support;

import leetcode.ListNode;

/**
 * Generator for ListNode
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/28 17:02
 */
public class ListNodeGenerator {
    private ListNodeGenerator() {
        // avoid malicious initialization
    }

    /**
     * Returns the head of the ListNode
     * where the value of each value is
     * given by the input nums
     *
     * @param nums the input nums
     * @return the head of the ListNode
     */
    public static ListNode getListNode(int[] nums) {
        assert nums != null;
        ListNode head = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            ListNode _head = new ListNode(nums[i]);
            _head.setNext(head);
            head = _head;
        }
        return head;
    }
}
