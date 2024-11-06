package m1466

import "testing"

func Test_minReorder(t *testing.T) {
	type args struct {
		n           int
		connections [][]int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{"Test case 1: equals 6", args{6, [][]int{{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}}}, 3},
		{"Test case 1: equals 2", args{5, [][]int{{1, 0}, {1, 2}, {3, 2}, {3, 4}}}, 2},
		{"Test case 1: equals 0", args{3, [][]int{{1, 0}, {2, 0}}}, 0},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := minReorder(tt.args.n, tt.args.connections); got != tt.want {
				t.Errorf("minReorder() = %v, want %v", got, tt.want)
			}
		})
	}
}
