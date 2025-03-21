/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m138;

/**
 * LeetCode 138
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/21 10:53
 */
public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        // Handle the empty list case
        if (head == null) {
            return null;
        }

        // Step 1: Interleave original and new nodes
        Node curr = head;
        while (curr != null) {
            // Create a new node with the same value
            Node newNode = new Node(curr.val);
            // Insert it after the current original node
            newNode.next = curr.next;
            curr.next = newNode;
            // Move to the next original node
            curr = newNode.next;
        }

        // Step 2: Set random pointers for the new nodes
        curr = head;
        while (curr != null) {
            // The new node is the next node after the original
            Node newNode = curr.next;
            // If the original has a random pointer, set the new node's random pointer
            if (curr.random != null) {
                newNode.random = curr.random.next; // Points to the new node after random
            } else {
                newNode.random = null;
            }
            // Move to the next original node (skip the new node)
            curr = newNode.next;
        }

        // Step 3: Separate the original and new lists
        Node newHead = head.next; // Head of the new list
        curr = head;              // Pointer to traverse original list
        while (curr != null) {
            Node newNode = curr.next;    // The new node following the original
            curr.next = newNode.next;    // Restore original list's next pointer
            // Set the new node's next pointer to the next new node, if it exists
            if (newNode.next != null) {
                newNode.next = newNode.next.next;
            }
            // Move to the next original node
            curr = curr.next;
        }

        return newHead;
    }

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
