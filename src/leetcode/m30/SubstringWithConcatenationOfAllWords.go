package m30

// LeetCode 30
func findSubstring(s string, words []string) []int {
	res := make([]int, 0)
	wordLen := len(words[0])
	totalLen := wordLen * len(words)
	if len(s) < totalLen {
		return res
	}

	// Build the frequency map for the words
	wordCount := make(map[string]int)
	for _, word := range words {
		wordCount[word]++
	}

	// We will traverse using "wordLen" different offsets
	for offset := 0; offset < wordLen; offset++ {
		slow := offset
		currCount := make(map[string]int)
		// number of words matched in the current window
		currMatched := 0

		// Move fast in steps of wordLen
		for fast := slow; fast+wordLen <= len(s); fast += wordLen {
			// Extract the word from s
			word := s[fast : fast+wordLen]
			// If it's in the word map, update currCount
			if freq, exists := wordCount[word]; exists {
				currCount[word]++

				// If we haven't exceeded the frequency yet, increment currMatched
				if currCount[word] <= freq {
					currMatched++
				} else {
					// We have exceeded the frequency for this word
					// Move slow until we no longer exceed
					for currCount[word] > freq {
						slowWord := s[slow : slow+wordLen]
						currCount[slowWord]--
						if currCount[slowWord] < wordCount[slowWord] {
							currMatched--
						}
						slow += wordLen
					}
				}

				// Check if we matched all words
				if currMatched == len(words) {
					res = append(res, slow)
					// Move slow by one word to look for next possibility
					slowWord := s[slow : slow+wordLen]
					currCount[slowWord]--
					currMatched--
					slow += wordLen
				}
			} else {
				// word not in wordCount, reset window
				currCount = make(map[string]int)
				currMatched = 0
				slow = fast + wordLen
			}
		}
	}
	return res
}
