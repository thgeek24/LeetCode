package m61

import "leetcode/src/leetcode/support"

func rotateRight(head *support.ListNode, k int) *support.ListNode {
	if head == nil || head.Next == nil {
		return head
	}

	listLen := 0
	curr := head
	var tail *support.ListNode
	for curr != nil {
		listLen++
		if curr.Next == nil {
			tail = curr
		}
		curr = curr.Next
	}

	k = k % listLen
	if k == 0 {
		return head
	}

	leftLen := listLen - k
	dummy := support.ListNode{Next: head}
	curr = &dummy
	for i := 0; i < leftLen; i++ {
		curr = curr.Next
	}

	newHead := curr.Next
	curr.Next = nil
	tail.Next = head
	return newHead
}
