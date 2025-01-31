package e125

import (
	"unicode"
)

// LeetCode 125
func isPalindrome(s string) bool {
	var letters []rune
	for _, char := range s {
		if unicode.IsDigit(char) || unicode.IsLetter(char) {
			letters = append(letters, unicode.ToLower(char))
		}
	}

	for i, j := 0, len(letters)-1; i < j; i, j = i+1, j-1 {
		if letters[i] != letters[j] {
			return false
		}
	}

	return true
}
