package m151

import (
	"strings"
)

// LeetCode 151
func reverseWords(s string) string {
	fields := strings.Fields(s)
	for i, j := 0, len(fields)-1; i < j; i, j = i+1, j-1 {
		fields[i], fields[j] = fields[j], fields[i]
	}

	return strings.Join(fields, " ")
}
