package m221

import "testing"

func Test_maximalSquare(t *testing.T) {
	tests := []struct {
		name   string
		matrix [][]byte
		want   int
	}{
		{"Test case 1", [][]byte{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}, 4},
		{"Test case 2", [][]byte{{'0', '1'}, {'1', '0'}}, 1},
		{"Test case 3", [][]byte{{'0'}}, 0},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := maximalSquare(tt.matrix); got != tt.want {
				t.Errorf("maximalSquare() = %v, want %v", got, tt.want)
			}
		})
	}
}
