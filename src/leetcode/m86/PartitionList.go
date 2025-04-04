package m86

import "leetcode/src/leetcode/support"

// LeetCode 86
func partition(head *support.ListNode, x int) *support.ListNode {
	beforeHead := &support.ListNode{Val: 0}
	afterHead := &support.ListNode{Val: 0}

	before := beforeHead
	after := afterHead
	for head != nil {
		if head.Val < x {
			before.Next = &support.ListNode{Val: head.Val}
			before = before.Next
		} else {
			after.Next = &support.ListNode{Val: head.Val}
			after = after.Next
		}
		head = head.Next
	}

	before.Next = afterHead.Next
	return beforeHead.Next
}
