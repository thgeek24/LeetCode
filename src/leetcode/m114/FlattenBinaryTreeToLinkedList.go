package m114

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// LeetCode 114
func flatten(root *TreeNode) {
	flattenToList(root)
}

func flattenToList(root *TreeNode) *TreeNode {
	if root == nil {
		return root
	}
	if root.Left == nil && root.Right == nil {
		return root
	}
	if root.Left == nil {
		root.Right = flattenToList(root.Right)
		return root
	}
	if root.Right == nil {
		root.Right = flattenToList(root.Left)
		root.Left = nil
		return root
	}
	flattenedLeft := flattenToList(root.Left)
	flattenedRight := flattenToList(root.Right)
	root.Right = flattenedLeft
	root.Left = nil
	curr := root
	for curr.Right != nil {
		curr = curr.Right
	}
	curr.Right = flattenedRight
	return root
}
