package m647

import "testing"

func Test_countSubstrings(t *testing.T) {
	tests := []struct {
		name string
		s    string
		want int
	}{
		{"Test case 1", "abc", 3},
		{"Test case 2", "aaa", 6},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := countSubstrings(tt.s); got != tt.want {
				t.Errorf("countSubstrings() = %v, want %v", got, tt.want)
			}
		})
	}
}
