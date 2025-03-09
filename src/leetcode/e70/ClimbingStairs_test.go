package e70

import "testing"

func Test_climbStairs(t *testing.T) {

	tests := []struct {
		name string
		n    int
		want int
	}{
		{"Test case 1", 2, 2},
		{"Test case 2", 3, 3},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := climbStairs(tt.n); got != tt.want {
				t.Errorf("climbStairs() = %v, want %v", got, tt.want)
			}
		})
	}
}
