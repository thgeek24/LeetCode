package w428

import "testing"

func Test_beautifulSplits(t *testing.T) {
	tests := []struct {
		name string
		nums []int
		want int
	}{
		{"Test case 1", []int{1, 1, 2, 1}, 2},
		{"Test case 2", []int{1, 2, 3, 4}, 0},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := beautifulSplits(tt.nums); got != tt.want {
				t.Errorf("beautifulSplits() = %v, want %v", got, tt.want)
			}
		})
	}
}
