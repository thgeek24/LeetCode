package m129

import "testing"

func Test_sumNumbers(t *testing.T) {
	tests := []struct {
		name string
		root *TreeNode
		want int
	}{
		{"Test case 1", &TreeNode{Val: 1,
			Left:  &TreeNode{Val: 2},
			Right: &TreeNode{Val: 3}}, 25},
		{"Test case 2", &TreeNode{Val: 4,
			Left:  &TreeNode{Val: 9, Left: &TreeNode{Val: 5}, Right: &TreeNode{Val: 1}},
			Right: &TreeNode{Val: 0}}, 1026},
		{"Test case 3", &TreeNode{Val: 9}, 9},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := sumNumbers(tt.root); got != tt.want {
				t.Errorf("sumNumbers() = %v, want %v", got, tt.want)
			}
		})
	}
}
