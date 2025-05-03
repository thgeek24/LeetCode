package h124

import "testing"

func Test_maxPathSum(t *testing.T) {
	tests := []struct {
		name string
		root *TreeNode
		want int
	}{
		{"Test case 1", &TreeNode{Val: 1,
			Left:  &TreeNode{Val: 2},
			Right: &TreeNode{Val: 3}}, 6},
		{"Test case 2", &TreeNode{Val: -10,
			Left: &TreeNode{Val: 9},
			Right: &TreeNode{Val: 20,
				Left:  &TreeNode{Val: 15},
				Right: &TreeNode{Val: 7}}}, 42},
		{"Test case 3", &TreeNode{Val: -2, Left: &TreeNode{Val: 1}}, 1},
		{"Test case 4", &TreeNode{Val: 5,
			Left: &TreeNode{Val: 4,
				Left: &TreeNode{Val: 11,
					Left:  &TreeNode{Val: 7},
					Right: &TreeNode{Val: 2},
				},
			},
			Right: &TreeNode{Val: 8,
				Left: &TreeNode{Val: 13},
				Right: &TreeNode{Val: 4,
					Right: &TreeNode{Val: 1},
				}}}, 48},
		{"Test case 5", &TreeNode{Val: 2,
			Left:  &TreeNode{Val: -1},
			Right: &TreeNode{Val: -2}}, 2},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := maxPathSum(tt.root); got != tt.want {
				t.Errorf("maxPathSum() = %v, want %v", got, tt.want)
			}
		})
	}
}
