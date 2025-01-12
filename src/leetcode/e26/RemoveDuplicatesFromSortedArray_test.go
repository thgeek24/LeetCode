package e26

import "testing"

func Test_removeDuplicates(t *testing.T) {
	tests := []struct {
		name string
		nums []int
		want int
	}{
		{"Test case 1", []int{1, 1, 2}, 2},
		{"Test case 2", []int{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5},
	}

	solutions := []RemoveDuplicatesFromSortedArray{
		Solution1{},
		Solution2{},
	}

	for _, sol := range solutions {
		for _, tt := range tests {
			t.Run(tt.name, func(t *testing.T) {
				numsCopy := make([]int, len(tt.nums))
				copy(numsCopy, tt.nums)
				if got := sol.removeDuplicates(numsCopy); got != tt.want {
					t.Errorf("%T.removeDuplicates() = %v, want %v", sol, got, tt.want)
				}
			})
		}
	}
}
