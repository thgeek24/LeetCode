package e290

import "strings"

// LeetCode 290
func wordPattern(pattern string, s string) bool {
	words := strings.Fields(s)
	if len(pattern) != len(words) {
		return false
	}

	pMap := make(map[byte]int)
	wMap := make(map[string]int)
	for i := 0; i < len(pattern); i++ {
		pIndex, existsInP := pMap[pattern[i]]
		wIndex, existsInW := wMap[words[i]]
		if existsInP != existsInW {
			return false
		}
		if pIndex != wIndex {
			return false
		}
		pMap[pattern[i]] = i
		wMap[words[i]] = i
	}
	return true
}
