package e58

import "strings"

// LeetCode 58
func lengthOfLastWord(s string) int {
	words := strings.Fields(s)
	wordCnt := len(words)
	if wordCnt == 0 {
		return 0
	}
	return len(words[wordCnt-1])
}
