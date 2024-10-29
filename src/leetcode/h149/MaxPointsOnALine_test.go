package h149

import "testing"

func TestMaxPointsOnALine(t *testing.T) {
	tests := []struct {
		name     string
		input    [][]int
		expected int
	}{
		{"Equals 3", [][]int{{1, 1}, {2, 2}, {3, 3}}, 3},
		{"Equals 4", [][]int{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}}, 4},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			actual := maxPoints(tt.input)
			if actual != tt.expected {
				t.Errorf("expected %d, got %d", tt.expected, actual)
			}
		})
	}
}
