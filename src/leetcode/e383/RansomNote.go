package e383

// LeetCode 383
func canConstruct(ransomNote string, magazine string) bool {
	if len(ransomNote) > len(magazine) {
		return false
	}
	target := make([]int, 26)
	source := make([]int, 26)
	for _, char := range ransomNote {
		target[char-97]++
	}
	for _, char := range magazine {
		source[char-97]++
	}

	for i := 0; i < 26; i++ {
		if target[i] > source[i] {
			return false
		}
	}
	return true
}
