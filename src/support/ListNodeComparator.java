/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package support;

import leetcode.ListNode;

/**
 * Utils to compare two {@link leetcode.ListNode}s
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 15:54
 */
public class ListNodeComparator {
    private ListNodeComparator() {
        // avoid malicious initialization
    }

    public static boolean equals(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == listNode2) {
            return true;
        }
        if (listNode1 == null || listNode2 == null) {
            return false;
        }
        if (listNode1.val != listNode2.val) {
            return false;
        }
        return equals(listNode1.next, listNode2.next);
    }
}
