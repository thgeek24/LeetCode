package e637

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// LeetCode 637
func averageOfLevels(root *TreeNode) []float64 {
	values := make([]float64, 0)
	count := make([]int, 0)
	fill(root, 0, &values, &count)
	for i := 0; i < len(values); i++ {
		values[i] /= float64(count[i])
	}
	return values
}

func fill(node *TreeNode, level int, values *[]float64, count *[]int) {
	if node == nil {
		return
	}
	if level < len(*count) {
		(*values)[level] += float64(node.Val)
		(*count)[level]++
	} else {
		*values = append(*values, float64(node.Val))
		*count = append(*count, 1)
	}
	fill(node.Left, level+1, values, count)
	fill(node.Right, level+1, values, count)
}
