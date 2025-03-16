package h224

import "testing"

func Test_calculate(t *testing.T) {
	tests := []struct {
		name string
		s    string
		want int
	}{
		{"Test case 1", "1 + 1", 2},
		{"Test case 2", " 2-1 + 2 ", 3},
		{"Test case 3", "(1+(4+5+2)-3)+(6+8)", 23},
		{"Test case 4", "1-(     -2)", 3},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := calculate(tt.s); got != tt.want {
				t.Errorf("calculate() = %v, want %v", got, tt.want)
			}
		})
	}
}
