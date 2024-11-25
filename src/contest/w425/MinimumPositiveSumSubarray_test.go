package w425

import "testing"

func Test_minimumSumSubarray(t *testing.T) {
	type args struct {
		nums []int
		l    int
		r    int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{"Test case 1", args{[]int{3, -2, 1, 4}, 2, 3}, 1},
		{"Test case 2", args{[]int{-2, 2, -3, 1}, 2, 3}, -1},
		{"Test case 3", args{[]int{1, 2, 3, 4}, 2, 4}, 3},
		{"Test case 3", args{[]int{-12, 8}, 1, 1}, 8},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := minimumSumSubarray(tt.args.nums, tt.args.l, tt.args.r); got != tt.want {
				t.Errorf("minimumSumSubarray() = %v, want %v", got, tt.want)
			}
		})
	}
}
