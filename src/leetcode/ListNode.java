/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Objects;

/**
 * ListNode implemented by LeetCode and commonly used problems related to linked list
 *
 * @author LeetCode
 */
public class ListNode {
    public int val;

    public ListNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + Objects.hashCode(next);
        return result;
    }
}
