package m300

import "testing"

func Test_lengthOfLIS(t *testing.T) {
	tests := []struct {
		name string
		nums []int
		want int
	}{
		{"Test case 1", []int{10, 9, 2, 5, 3, 7, 101, 18}, 4},
		{"Test case 2", []int{0, 1, 0, 3, 2, 3}, 4},
		{"Test case 3", []int{7, 7, 7, 7, 7, 7, 7}, 1},
	}

	solutions := []LongestIncreasingSubsequence{
		Solution1{},
		Solution2{},
	}

	for _, sol := range solutions {
		for _, tt := range tests {
			t.Run(tt.name, func(t *testing.T) {
				if got := sol.lengthOfLIS(tt.nums); got != tt.want {
					t.Errorf("lengthOfLIS() = %v, want %v", got, tt.want)
				}
			})
		}
	}
}
