package e226

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// LeetCode 226
func invertTree(root *TreeNode) *TreeNode {
	if root == nil {
		return root
	}
	invertedLeft := invertTree(root.Left)
	invertedRight := invertTree(root.Right)
	root.Left = invertedRight
	root.Right = invertedLeft
	return root
}
