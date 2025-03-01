package m209

import "testing"

func Test_minSubArrayLen(t *testing.T) {
	type args struct {
		target int
		nums   []int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{"Test case 1", args{7, []int{2, 3, 1, 2, 4, 3}}, 2},
		{"Test case 2", args{4, []int{1, 4, 4}}, 1},
		{"Test case 3", args{11, []int{1, 1, 1, 1, 1, 1, 1, 1}}, 0},
		{"Test case 4", args{7, []int{8}}, 1},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := minSubArrayLen(tt.args.target, tt.args.nums); got != tt.want {
				t.Errorf("minSubArrayLen() = %v, want %v", got, tt.want)
			}
		})
	}
}
