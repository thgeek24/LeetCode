/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package interview.cmbcloud;

import leetcode.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/13 14:19
 */
public class PerfectLinkedList {
    public ListNode perfectLinkList(ListNode head) {
        if (head == null) {
            return null;
        }

        // Step 1: Count the frequency of each value
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        ListNode current = head;
        while (current != null) {
            frequencyMap.put(current.val, frequencyMap.getOrDefault(current.val, 0) + 1);
            // 你怎么在类里直接写代码行，不是要有方法声明么
            current = current.next;
        }

        // Step 2: Find the value with the maximum frequency
        int targetValue = head.val;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                targetValue = entry.getKey();
            }
        }

        // Step 3: Rebuild the list with only nodes of the target value
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        current = head;
        while (current != null) {
            if (current.val == targetValue) {
                tail.next = new ListNode(current.val);
                tail = tail.next;
            }
            current = current.next;
        }

        return dummy.next;
    }
}
