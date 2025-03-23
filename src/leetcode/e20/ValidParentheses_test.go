package e20

import "testing"

func Test_isValid(t *testing.T) {
	tests := []struct {
		name string
		s    string
		want bool
	}{
		{"Test case 1", "()", true},
		{"Test case 2", "()[]{}", true},
		{"Test case 3", "(]", false},
		{"Test case 4", "([])", true},
		{"Test case 5", "]", false},
		{"Test case 6", "(])", false},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := isValid(tt.s); got != tt.want {
				t.Errorf("isValid() = %v, want %v", got, tt.want)
			}
		})
	}
}
