package m316

import "testing"

func Test_removeDuplicateLetters(t *testing.T) {
	tests := []struct {
		name string
		s    string
		want string
	}{
		{"Test case 1", "bcabc", "abc"},
		{"Test case 2", "cbacdcbc", "acdb"},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := removeDuplicateLetters(tt.s); got != tt.want {
				t.Errorf("removeDuplicateLetters() = %v, want %v", got, tt.want)
			}
		})
	}
}
