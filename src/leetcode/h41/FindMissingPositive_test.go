package h41

import "testing"

func Test_firstMissingPositive(t *testing.T) {
	tests := []struct {
		name string
		nums []int
		want int
	}{
		{"Test case 1: 3", []int{1, 2, 0}, 3},
		{"Test case 2: 2", []int{3, 4, -1, 1}, 2},
		{"Test case 3: 1", []int{7, 8, 9, 11, 12}, 1},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := firstMissingPositive(tt.nums); got != tt.want {
				t.Errorf("firstMissingPositive() = %v, want %v", got, tt.want)
			}
		})
	}
}
