package m30

// LeetCode 30
func findSubstring(s string, words []string) []int {
	result := []int{}

	// Base checks
	if len(s) == 0 || len(words) == 0 {
		return result
	}

	wordLen := len(words[0])
	totalLen := wordLen * len(words)
	if len(s) < totalLen {
		return result
	}

	// Build the frequency map for the words
	wordCount := make(map[string]int)
	for _, w := range words {
		wordCount[w]++
	}

	// We will traverse using "wordLen" different offsets
	for offset := 0; offset < wordLen; offset++ {
		left := offset
		currentCount := make(map[string]int)
		// number of words matched in the current window
		countMatched := 0

		// Move right in steps of wordLen
		for right := offset; right+wordLen <= len(s); right += wordLen {
			// Extract the word from s
			word := s[right : right+wordLen]
			// If it's in the word map, update currentCount
			if freq, exists := wordCount[word]; exists {
				currentCount[word]++

				// If we haven't exceeded the frequency yet, increment countMatched
				if currentCount[word] <= freq {
					countMatched++
				} else {
					// We have exceeded the frequency for this word
					// Move left until we no longer exceed
					for currentCount[word] > freq {
						leftWord := s[left : left+wordLen]
						currentCount[leftWord]--
						if currentCount[leftWord] < wordCount[leftWord] {
							countMatched--
						}
						left += wordLen
					}
				}

				// Check if we matched all words
				if countMatched == len(words) {
					result = append(result, left)
					// Move left by one word to look for next possibility
					leftWord := s[left : left+wordLen]
					currentCount[leftWord]--
					countMatched--
					left += wordLen
				}
			} else {
				// word not in wordCount, reset window
				currentCount = make(map[string]int)
				countMatched = 0
				left = right + wordLen
			}
		}
	}

	return result
}
