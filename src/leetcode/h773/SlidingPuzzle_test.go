package h773

import "testing"

func Test_slidingPuzzle(t *testing.T) {
	tests := []struct {
		name  string
		board [][]int
		want  int
	}{
		{"Test case 1", [][]int{{1, 2, 3}, {4, 0, 5}}, 1},
		{"Test case 2", [][]int{{1, 2, 3}, {5, 4, 0}}, -1},
		{"Test case 3", [][]int{{4, 1, 2}, {5, 0, 3}}, 5},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := slidingPuzzle(tt.board); got != tt.want {
				t.Errorf("slidingPuzzle() = %v, want %v", got, tt.want)
			}
		})
	}
}
