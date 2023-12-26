/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.security.SecureRandom;
import java.util.Random;

/**
 * LeetCode 382
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/26 18:42
 */
public class LinkedListRandomNode_382 {
    private final ListNode head;

    public LinkedListRandomNode_382(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        Random random = new SecureRandom();
        ListNode _head = head;
        int res = _head.val;
        int i = 0;
        while (_head != null) {
            if (random.nextInt(++i) == 0) {
                res = _head.val;
            }
            _head = _head.next;
        }
        return res;
    }
}
