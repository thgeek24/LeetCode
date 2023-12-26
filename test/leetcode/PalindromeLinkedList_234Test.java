/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link PalindromeLinkedList_234}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/26 13:47
 */
class PalindromeLinkedList_234Test {
    @Test
    void isNotPalindrome() {
        PalindromeLinkedList_234 test = new PalindromeLinkedList_234();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        assertFalse(test.isPalindrome(head));
    }

    @Test
    void isPalindrome() {
        PalindromeLinkedList_234 test = new PalindromeLinkedList_234();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        assertTrue(test.isPalindrome(head));
    }

    @Test
    void singleNodeIsPalindrome() {
        PalindromeLinkedList_234 test = new PalindromeLinkedList_234();
        ListNode head = new ListNode(1);
        assertTrue(test.isPalindrome(head));
    }
}