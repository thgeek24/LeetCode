package m5

import "testing"

func Test_longestPalindrome(t *testing.T) {
	tests := []struct {
		name string
		s    string
		want string
	}{
		{"Test case 1", "babad", "bab"},
		{"Test case 2", "cbbd", "bb"},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := longestPalindrome(tt.s); got != tt.want {
				t.Errorf("longestPalindrome() = %v, want %v", got, tt.want)
			}
		})
	}
}
