package e543

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func diameterOfBinaryTree(root *TreeNode) int {
	_, totalMax := nodesOfBinaryTree(root)
	return totalMax - 1
}

// Returns the max number of nodes from either left or right (including the root),
// and the max number of nodes that include the root
func nodesOfBinaryTree(root *TreeNode) (int, int) {
	if root == nil {
		return 0, 0
	}
	if root.Left == nil && root.Right == nil {
		return 1, 1
	}

	leftSide, leftTotal := nodesOfBinaryTree(root.Left)
	rightSide, rightTotal := nodesOfBinaryTree(root.Right)

	sideMax := maxInt(leftSide, rightSide) + 1
	totalMax := maxInt(leftTotal, rightTotal)
	totalMax = maxInt(totalMax, leftSide+rightSide+1)
	return sideMax, totalMax
}

func maxInt(a, b int) int {
	if a > b {
		return a
	}
	return b
}
