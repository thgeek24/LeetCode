package m230

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

type Count struct {
	Val int
	Res int
}

/**
 * LeetCode 230
 */
func kthSmallest(root *TreeNode, k int) int {
	count := Count{Val: 0}
	kthSmallestHelper(root, k, &count)
	return count.Res
}

func kthSmallestHelper(root *TreeNode, k int, count *Count) {
	if root == nil {
		return
	}

	count.Val++
	if count.Val == k {
		count.Res = root.Val
		return
	} else if count.Val > k {
		return
	}

	kthSmallestHelper(root.Left, k, count)
	kthSmallestHelper(root.Right, k, count)
}
