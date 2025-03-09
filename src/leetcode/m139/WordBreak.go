package m139

// LeetCode 139
func wordBreak(s string, wordDict []string) bool {
	segmented := make([]bool, len(s)+1)
	segmented[0] = true
	for i := 1; i < len(segmented); i++ {
		for _, word := range wordDict {
			wordLen := len(word)
			if wordLen <= i && segmented[i-wordLen] && s[(i-wordLen):i] == word {
				segmented[i] = true
				break
			}
		}
	}
	return segmented[len(s)]
}
