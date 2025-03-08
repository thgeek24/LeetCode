package m1091

import "testing"

func Test_shortestPathBinaryMatrix(t *testing.T) {
	tests := []struct {
		name string
		grid [][]int
		want int
	}{
		{"Test case 1", [][]int{{0, 1}, {1, 0}}, 2},
		{"Test case 2", [][]int{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}, 4},
		{"Test case 3", [][]int{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}}, -1},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := shortestPathBinaryMatrix(tt.grid); got != tt.want {
				t.Errorf("shortestPathBinaryMatrix() = %v, want %v", got, tt.want)
			}
		})
	}
}
