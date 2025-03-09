package e169

import "testing"

func Test_majorityElement(t *testing.T) {
	tests := []struct {
		name string
		nums []int
		want int
	}{
		{"Test case 1", []int{3, 2, 3}, 3},
		{"Test case 2", []int{2, 2, 1, 1, 1, 2, 2}, 2},
		{"Test case 3", []int{6, 5, 5}, 5},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := majorityElement(tt.nums); got != tt.want {
				t.Errorf("majorityElement() = %v, want %v", got, tt.want)
			}
		})
	}
}
