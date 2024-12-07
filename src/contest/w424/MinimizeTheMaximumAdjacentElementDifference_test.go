package w424

import "testing"

func Test_minDifference(t *testing.T) {
	tests := []struct {
		name string
		nums []int
		want int
	}{
		{"Test case 1", []int{1, 2, -1, 10, 8}, 4},
		{"Test case 2", []int{-1, -1, -1}, 0},
		{"Test case 3", []int{-1, 10, -1, 8}, 1},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := minDifference(tt.nums); got != tt.want {
				t.Errorf("minDifference() = %v, want %v", got, tt.want)
			}
		})
	}
}
