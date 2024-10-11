package m236

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

/**
 * LeetCode 236
 */
func lowestCommonAncestor(root, p, q *TreeNode) *TreeNode {
	if p.Val == root.Val || q.Val == root.Val {
		return root
	}

	isPLeft := true
	pDepth, pPrev := findDepth(root.Left, root, p.Val, 1)
	if pDepth == -1 {
		isPLeft = false
		pDepth, pPrev = findDepth(root.Right, root, p.Val, 1)
	}

	isQLeft := true
	qDepth, _ := findDepth(root.Left, root, q.Val, 1)
	if qDepth == -1 {
		isQLeft = false
		qDepth, _ = findDepth(root.Right, root, q.Val, 1)
	}

	if isPLeft != isQLeft {
		return root
	}

	if pDepth < qDepth {
		return p
	} else if pDepth > qDepth {
		return q
	} else {
		return pPrev
	}
}

func findDepth(curr, prev *TreeNode, target, depth int) (int, *TreeNode) {
	if curr == nil {
		return -1, prev
	}
	if curr.Val == target {
		return depth, prev
	}
	leftDepth, LeftPrev := findDepth(curr.Left, curr, target, depth+1)
	if leftDepth != -1 {
		return leftDepth, LeftPrev
	}
	return findDepth(curr.Right, curr, target, depth+1)
}
