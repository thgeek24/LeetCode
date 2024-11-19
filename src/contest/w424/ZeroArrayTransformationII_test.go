package w424

import "testing"

func Test_minZeroArray(t *testing.T) {
	type args struct {
		nums    []int
		queries [][]int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{"Test case 1", args{nums: []int{2, 0, 2}, queries: [][]int{{0, 2, 1}, {0, 2, 1}, {1, 1, 3}}}, 2},
		{"Test case 2", args{nums: []int{4, 3, 2, 1}, queries: [][]int{{1, 3, 2}, {0, 2, 1}}}, -1}}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := minZeroArray(tt.args.nums, tt.args.queries); got != tt.want {
				t.Errorf("minZeroArray() = %v, want %v", got, tt.want)
			}
		})
	}
}
