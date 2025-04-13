package m106

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// LeetCode 106
func buildTree(inorder []int, postorder []int) *TreeNode {
	// Build a hash map to store the index of each element in the inorder slice.
	inorderIndex := make(map[int]int)
	for i, v := range inorder {
		inorderIndex[v] = i
	}

	// pIndex points to the current root in the postorder slice (starting from the end).
	pIndex := len(postorder) - 1

	// helper is a recursive function that builds the tree between left and right indices.
	var helper func(left, right int) *TreeNode
	helper = func(left, right int) *TreeNode {
		// Base case: if no elements are left in this subsection, return nil.
		if left > right {
			return nil
		}

		// The current root is at pIndex in the postorder slice.
		rootVal := postorder[pIndex]
		pIndex--

		// Create the node for the current root.
		root := &TreeNode{Val: rootVal}

		// Retrieve the index of the root in the inorder slice.
		index := inorderIndex[rootVal]

		// Recursively build the right subtree first (because we are consuming the
		// postorder slice from the end), then the left subtree.
		root.Right = helper(index+1, right)
		root.Left = helper(left, index-1)

		return root
	}

	return helper(0, len(inorder)-1)
}
