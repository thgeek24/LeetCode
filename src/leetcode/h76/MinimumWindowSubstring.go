package h76

func minWindow(s string, t string) string {
	// Edge case: if t is longer than s, return empty string
	if len(s) < len(t) {
		return ""
	}

	// Frequency map for string t
	tFreq := make(map[byte]int)
	for i := 0; i < len(t); i++ {
		tFreq[t[i]]++
	}

	// Sliding window pointers and variables
	left, right := 0, 0
	minLen := len(s) + 1
	minStart := 0
	windowFreq := make(map[byte]int)
	validCount := 0
	requiredCount := len(tFreq)

	// Sliding window
	for right < len(s) {
		// Expand the window by moving the right pointer
		charRight := s[right]
		windowFreq[charRight]++
		if windowFreq[charRight] == tFreq[charRight] {
			validCount++
		}

		// Shrink the window by moving the left pointer
		for validCount == requiredCount && left <= right {
			// Check if we have found a smaller window
			windowSize := right - left + 1
			if windowSize < minLen {
				minLen = windowSize
				minStart = left
			}

			// Move the left pointer to shrink the window
			charLeft := s[left]
			windowFreq[charLeft]--
			if windowFreq[charLeft] < tFreq[charLeft] {
				validCount--
			}
			left++
		}

		// Move the right pointer forward to explore the next character
		right++
	}

	// If no valid window was found, return an empty string
	if minLen == len(s)+1 {
		return ""
	}

	// Return the smallest valid window
	return s[minStart : minStart+minLen]
}
