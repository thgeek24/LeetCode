package m189

import "testing"

func Test_rotate(t *testing.T) {
	type args struct {
		nums []int
		k    int
	}
	tests := []struct {
		name     string
		args     args
		expected []int
	}{
		{"Test case 1", args{[]int{1, 2, 3, 4, 5, 6, 7}, 3}, []int{5, 6, 7, 1, 2, 3, 4}},
		{"Test case 2", args{[]int{-1, -100, 3, 99}, 2}, []int{3, 99, -1, -100}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			rotate(tt.args.nums, tt.args.k)
			for i := range tt.args.nums {
				if tt.args.nums[i] != tt.expected[i] {
					t.Errorf("rotate() = %v, want %v", tt.args.nums, tt.expected)
					break
				}
			}
		})
	}
}
