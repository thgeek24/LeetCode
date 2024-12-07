package e3210

import "strings"

// LeetCode 3210
func getEncryptedString(s string, k int) string {
	var sb strings.Builder
	chars := []rune(s)
	for i := range chars {
		shift := (i + k) % len(chars)
		sb.WriteRune(chars[shift])
	}
	return sb.String()
}
