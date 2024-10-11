package m199

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func rightSideView(root *TreeNode) []int {
	var res []int
	addRightSide(root, 0, &res)
	return res
}

func addRightSide(root *TreeNode, depth int, view *[]int) {
	if root == nil {
		return
	}
	if len(*view) > depth {
		addRightSide(root.Right, depth+1, view)
		addRightSide(root.Left, depth+1, view)
		return
	}
	*view = append(*view, root.Val)
	addRightSide(root.Right, depth+1, view)
	addRightSide(root.Left, depth+1, view)
}
