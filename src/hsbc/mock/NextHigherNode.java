/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package hsbc.mock;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * HSBC Mock from naukri.com
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/04 17:07
 */
public class NextHigherNode {
    public static Node nextHigherNode(Node head) {
        Queue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.data));
        Node curr = head;
        while (curr != null) {
            queue.offer(curr);
            curr = curr.next;
        }
        Node res = null;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (res == null) {
                res = node;
            }
            node.nextHigher = queue.isEmpty() ? null : queue.peek();
        }

        return res;
    }

    public static class Node {
        public int data;
        public Node next;
        public Node nextHigher;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.nextHigher = null;
        }
    }
}
