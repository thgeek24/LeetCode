package w423

import "testing"

func Test_sumOfGoodSubsequences(t *testing.T) {
	tests := []struct {
		name string
		nums []int
		want int
	}{
		{"Test case 1", []int{1, 2, 1}, 14},
		{"Test case 2", []int{3, 4, 5}, 40},
		{"Test case 3", []int{89, 88, 89, 89, 90, 88, 88, 90, 89, 87, 75, 45, 90, 87, 88, 19, 89, 88, 88, 89, 28, 18, 27, 81, 70, 99, 91, 89, 44, 90, 89, 18, 90, 20, 48, 28, 64, 82, 87, 88, 8, 28, 68, 91, 89, 90, 68, 9, 88, 90, 89, 0, 74, 21, 1, 69, 45, 4, 89, 90, 100, 9, 84, 88, 26, 66, 29, 90, 2, 87, 10, 5, 63, 21, 70, 42, 56, 49, 2, 91, 6, 88, 18, 62, 46, 99, 91, 57, 52, 89, 27, 63, 29, 62, 66}, 513210180},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := sumOfGoodSubsequences(tt.nums); got != tt.want {
				t.Errorf("sumOfGoodSubsequences() = %v, want %v", got, tt.want)
			}
		})
	}
}
