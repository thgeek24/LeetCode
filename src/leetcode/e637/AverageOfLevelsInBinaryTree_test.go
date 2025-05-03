package e637

import (
	"reflect"
	"testing"
)

func Test_averageOfLevels(t *testing.T) {
	tests := []struct {
		name string
		root *TreeNode
		want []float64
	}{
		{"Test case 1", &TreeNode{
			Val: 3,
			Left: &TreeNode{
				Val: 9,
			},
			Right: &TreeNode{
				Val: 20,
				Left: &TreeNode{
					Val: 15,
				},
				Right: &TreeNode{
					Val: 7,
				},
			},
		}, []float64{3.00000, 14.50000, 11.00000}},

		{"Test case 2", &TreeNode{
			Val: 3,
			Left: &TreeNode{
				Val: 9,
				Left: &TreeNode{
					Val: 15,
				},
				Right: &TreeNode{
					Val: 7,
				},
			},
			Right: &TreeNode{
				Val: 20,
			},
		}, []float64{3.00000, 14.50000, 11.00000}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := averageOfLevels(tt.root); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("averageOfLevels() = %v, want %v", got, tt.want)
			}
		})
	}
}
