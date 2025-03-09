package e205

// LeetCode 205
func isIsomorphic(s string, t string) bool {
	sMap := make(map[byte]int)
	tMap := make(map[byte]int)
	for i := 0; i < len(s); i++ {
		_, existsInS := sMap[s[i]]
		_, existsInT := tMap[t[i]]
		if existsInS != existsInT {
			return false
		}
		if sMap[s[i]] != tMap[t[i]] {
			return false
		}
		sMap[s[i]] = i
		tMap[t[i]] = i
	}
	return true
}
