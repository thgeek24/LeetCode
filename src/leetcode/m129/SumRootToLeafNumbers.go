package m129

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// LeetCode 129
func sumNumbers(root *TreeNode) int {
	return sumNumberSlice(root, 0)
}

func sumNumberSlice(node *TreeNode, sum int) int {
	if node == nil {
		return sum
	}
	sum = sum*10 + node.Val
	if node.Left == nil && node.Right == nil {
		return sum
	}
	if node.Left == nil {
		return sumNumberSlice(node.Right, sum)
	}
	if node.Right == nil {
		return sumNumberSlice(node.Left, sum)
	}
	leftSum := sumNumberSlice(node.Left, sum)
	rightSum := sumNumberSlice(node.Right, sum)
	return leftSum + rightSum
}
