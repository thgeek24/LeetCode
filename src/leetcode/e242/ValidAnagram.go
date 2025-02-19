package e242

// LeetCode 242
func isAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}

	sCount := make([]int, 26)
	tCount := make([]int, 26)
	for i := 0; i < len(s); i++ {
		sCount[s[i]-97]++
		tCount[t[i]-97]++
	}
	for i := 0; i < 26; i++ {
		if sCount[i] != tCount[i] {
			return false
		}
	}
	return true
}
