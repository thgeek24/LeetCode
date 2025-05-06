package h124

import "math"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// LeetCode 124
func maxPathSum(root *TreeNode) int {
	sum := math.MinInt
	maxPathSumHelper(root, &sum)
	return sum
}

func maxPathSumHelper(root *TreeNode, max *int) int {
	if root.Left == nil && root.Right == nil {
		*max = maxInt(root.Val, *max)
		return root.Val
	}
	if root.Left == nil {
		rightSum := maxPathSumHelper(root.Right, max)
		temp := maxInt(root.Val, root.Val+rightSum)
		*max = maxInt(temp, *max)
		return temp
	}
	if root.Right == nil {
		leftSum := maxPathSumHelper(root.Left, max)
		temp := maxInt(root.Val, root.Val+leftSum)
		*max = maxInt(temp, *max)
		return temp
	}

	leftSum := maxPathSumHelper(root.Left, max)
	rightSum := maxPathSumHelper(root.Right, max)

	maxSide := maxInt(leftSum, rightSum)
	maxLeafSum := maxInt(maxSide, leftSum+rightSum)
	*max = maxInt(maxInt(root.Val, root.Val+maxLeafSum), *max)

	temp := maxInt(root.Val, root.Val+maxSide)
	return temp
}

func maxInt(a, b int) int {
	if a > b {
		return a
	}
	return b
}
