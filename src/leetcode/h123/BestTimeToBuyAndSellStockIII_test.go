package h123

import "testing"

func Test_maxProfit(t *testing.T) {
	tests := []struct {
		name   string
		prices []int
		want   int
	}{
		{"Test case 1:", []int{3, 3, 5, 0, 0, 3, 1, 4}, 6},
		{"Test case 2:", []int{1, 2, 3, 4, 5}, 4},
		{"Test case 3:", []int{7, 6, 4, 3, 1}, 0},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := maxProfit(tt.prices); got != tt.want {
				t.Errorf("maxProfit() = %v, want %v", got, tt.want)
			}
		})
	}
}
