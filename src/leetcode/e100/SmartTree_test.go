package e100

import "testing"

func Test_isSameTree(t *testing.T) {
	type args struct {
		p *TreeNode
		q *TreeNode
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		{"Test case 1", args{&TreeNode{1, &TreeNode{Val: 2},
			&TreeNode{Val: 3}}, &TreeNode{1, &TreeNode{Val: 2}, &TreeNode{Val: 3}}}, true},
		{"Test case 2", args{&TreeNode{1, &TreeNode{Val: 2},
			nil}, &TreeNode{1, nil, &TreeNode{Val: 2}}}, false},
		{"Test case 3", args{&TreeNode{1, &TreeNode{Val: 2},
			&TreeNode{Val: 1}}, &TreeNode{1, &TreeNode{Val: 1}, &TreeNode{Val: 2}}}, false},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := isSameTree(tt.args.p, tt.args.q); got != tt.want {
				t.Errorf("isSameTree() = %v, want %v", got, tt.want)
			}
		})
	}
}
