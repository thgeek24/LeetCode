package e202

import "testing"

func Test_isHappy(t *testing.T) {
	tests := []struct {
		name string
		n    int
		want bool
	}{
		{"Test case 1", 19, true},
		{"Test case 2", 9, false},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := isHappy(tt.n); got != tt.want {
				t.Errorf("isHappy() = %v, want %v", got, tt.want)
			}
		})
	}
}
