package m173

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// BSTIterator LeetCode 173
type BSTIterator struct {
	slice []int
}

func Constructor(root *TreeNode) BSTIterator {
	iterator := BSTIterator{
		slice: make([]int, 0),
	}
	build(root, &iterator.slice)
	return iterator
}

func build(root *TreeNode, slice *[]int) {
	if root == nil {
		return
	}
	build(root.Left, slice)
	*slice = append(*slice, root.Val)
	build(root.Right, slice)
}

func (this *BSTIterator) Next() int {
	res := this.slice[0]
	this.slice = this.slice[1:]
	return res
}

func (this *BSTIterator) HasNext() bool {
	return len(this.slice) > 0
}
