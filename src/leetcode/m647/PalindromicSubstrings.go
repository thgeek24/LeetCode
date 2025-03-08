package m647

// LeetCode 647
func countSubstrings(s string) int {
	count := 0
	for i := 0; i < len(s); i++ {
		count += countPalindromes(i, i, s)
		if i != len(s)-1 {
			count += countPalindromes(i, i+1, s)
		}
	}
	return count
}

func countPalindromes(i, j int, s string) int {
	count := 0
	for i >= 0 && j < len(s) && s[i] == s[j] {
		count++
		i--
		j++
	}
	return count
}
