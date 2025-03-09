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
	// Base case: if the current node is null or matches either p or q, return the current node
	if root == nil || root == p || root == q {
		return root
	}

	// Recur for left and right subtrees
	left := lowestCommonAncestor(root.Left, p, q)
	right := lowestCommonAncestor(root.Right, p, q)

	// If both left and right are non-null, current node is the LCA
	if left != nil && right != nil {
		return root
	}

	// Otherwise, return non-null node (either left or right)
	if left != nil {
		return left
	}

	return right
}
