/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m146;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 146
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/11 21:34
 */
public class LRUCache {
    private final Map<Integer, Node> cache;

    private final NodeList list;

    public LRUCache(int capacity) {
        if (capacity <= 0 || capacity > 3000) {
            throw new IllegalArgumentException("Illegal capacity");
        }
        this.cache = new HashMap<>();
        this.list = new NodeList(capacity);
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        Node node = cache.get(key);
        list.removeNode(node);
        list.addLast(key, node.getValue());

        cache.put(key, list.getLast());
        return node.getValue();
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            list.removeNode(node);
        } else {
            if (list.getSize() == list.getCapacity()) {
                Node lru = list.getFirst();
                cache.remove(lru.getKey());
            }
        }
        list.addLast(key, value);
        cache.put(key, list.getLast());
    }

    public static class NodeList {
        @Override
        public String toString() {
            Node next = first;
            StringBuilder keyBuilder = new StringBuilder();
            while (next != null) {
                keyBuilder.append("[")
                        .append(next.getKey())
                        .append(",")
                        .append(next.getValue())
                        .append("]")
                        .append(" ");
                next = next.getNext();
            }
            return "capacity=" + capacity + System.lineSeparator() +
                    "size=" + size + System.lineSeparator() +
                    "list=" + keyBuilder + System.lineSeparator();
        }

        private int size = 0;

        private final int capacity;

        private Node first;

        private Node last;

        public NodeList(int capacity) {
            if (capacity <= 0) {
                throw new IllegalArgumentException("Illegal capacity");
            }
            this.capacity = capacity;
        }

        public void addLast(int key, int value) {
            // inefficient capacity
            if (size == capacity) {
                removeFirst();
            }
            // enough capacity
            Node newLast = new Node(key, value);
            if (last == null) {
                last = newLast;
                first = newLast;
            } else {
                Node _last = last;
                last = newLast;
                last.setPrev(_last);
                _last.setNext(last);
            }
            size++;
        }

        public void removeFirst() {
            if (first == null) {
                return;
            }
            Node _first = first;
            first = first.getNext();
            if (first == null) {
                last = null;
            } else {
                first.setPrev(null);
            }
            _first.setNext(null);
            size--;
        }

        public void removeLast() {
            if (last == null) {
                return;
            }
            Node _last = last;
            last = last.getPrev();
            if (last == null) {
                first = null;
            } else {
                last.setNext(null);
            }
            _last.setPrev(null);
            size--;
        }

        public void removeNode(Node node) {
            if (node == null) {
                return;
            }

            if (first == node) {
                removeFirst();
                return;
            }

            if (last == node) {
                removeLast();
                return;
            }

            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
            size--;
        }

        public Node getLast() {
            return last;
        }

        public int getSize() {
            return size;
        }

        public int getCapacity() {
            return capacity;
        }

        public Node getFirst() {
            return first;
        }
    }

    public static class Node {
        private int key;

        private int value;

        private Node prev;

        private Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
