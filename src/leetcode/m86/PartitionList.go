package m86

import "leetcode/src/leetcode/support"

// LeetCode 86
func partition(head *support.ListNode, x int) *support.ListNode {
	if head == nil {
		return head
	}

	dummy := &support.ListNode{Next: head}
	fast := dummy
	slow := dummy
	for fast.Next != nil {
		for fast.Next != nil && fast.Next.Val >= x {
			fast = fast.Next
		}
		for slow != fast && slow.Next.Val < x {
			slow = slow.Next
		}

		if fast != slow {
			less := fast.Next
			greater := slow.Next

			temp := less.Next
			less.Next = greater.Next
			greater.Next = temp

			slow.Next = less
			fast.Next = greater
		}

		fast = fast.Next
		slow = slow.Next
	}

	return dummy.Next
}
