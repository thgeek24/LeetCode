package m114

import (
	"testing"
)

func Test_flatten(t *testing.T) {
	tests := []struct {
		name string
		args *TreeNode
	}{
		{"Test case 1", &TreeNode{Val: 1, Left: &TreeNode{Val: 2}, Right: &TreeNode{Val: 5}}},
		{"Test case 2", &TreeNode{Val: 1, Left: &TreeNode{Val: 2}}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			flatten(tt.args)
		})
	}
}
