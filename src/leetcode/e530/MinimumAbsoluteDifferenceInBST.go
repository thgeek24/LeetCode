package e530

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

const maxInt = int(^uint(0) >> 1)

var (
	prevVal int  // holds the previously‐visited node’s value
	prevSet bool // indicates whether prevVal is initialized
	minDiff int  // running minimum difference
)

// LeetCode 530
// getMinimumDifference returns the minimum absolute difference between
// values of any two nodes in the BST.
func getMinimumDifference(root *TreeNode) int {
	prevSet = false
	minDiff = maxInt
	inorder(root)
	return minDiff
}

// inorder does an in‐order traversal, updating minDiff by comparing
// the current node’s value with prevVal.
func inorder(node *TreeNode) {
	if node == nil {
		return
	}
	inorder(node.Left)

	if prevSet {
		diff := node.Val - prevVal
		if diff < 0 {
			diff = -diff
		}
		if diff < minDiff {
			minDiff = diff
		}
	}
	prevVal = node.Val
	prevSet = true

	inorder(node.Right)
}
