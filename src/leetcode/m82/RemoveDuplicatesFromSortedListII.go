package m82

import (
	"leetcode/src/leetcode/support"
)

// LeetCode 82
func deleteDuplicates(head *support.ListNode) *support.ListNode {
	// Create a dummy node to simplify handling edge cases.
	dummy := &support.ListNode{Val: 0, Next: head}
	prev := dummy
	current := head

	for current != nil {
		// If current node is the start of a duplicate sequence...
		if current.Next != nil && current.Val == current.Next.Val {
			// Skip all nodes with the same value.
			for current.Next != nil && current.Val == current.Next.Val {
				current = current.Next
			}
			// Connect prev with the node after the duplicates.
			prev.Next = current.Next
		} else {
			// No duplicates, move prev pointer.
			prev = prev.Next
		}
		// Move current pointer forward.
		current = current.Next
	}

	return dummy.Next
}
