package e222

import "leetcode/src/leetcode/support"

func countNodes(root *support.TreeNode) int {
	if root == nil {
		return 0
	}

	leftHeight := getHeight(root.Left)
	rightHeight := getHeight(root.Right)

	if leftHeight == rightHeight {
		return (1 << leftHeight) + countNodes(root.Right)
	} else {
		return (1 << rightHeight) + countNodes(root.Left)
	}
}

func getHeight(root *support.TreeNode) int {
	height := 0
	for root != nil {
		height++
		root = root.Left
	}
	return height
}
