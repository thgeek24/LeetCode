package h76

import "math"

// LeetCode 76
func minWindow(s string, t string) string {
	target := len(t)
	letterCount := make(map[rune]int)
	for _, letter := range t {
		letterCount[letter]++
	}

	left, right, currMatched := 0, 0, 0
	var resLeft, resRight int
	minLen := math.MaxInt
	currLetterCount := make(map[int32]int)
	for right < len(s) {
		letter := rune(s[right])
		if freq, exists := letterCount[letter]; exists {
			currLetterCount[letter]++

			if currLetterCount[letter] <= freq {
				currMatched++
			} else {
				for currLetterCount[letter] > freq {
					leftLetter := rune(s[left])
					if _, ok := letterCount[leftLetter]; ok {
						currLetterCount[leftLetter]--
						if currLetterCount[leftLetter] < letterCount[leftLetter] {
							currMatched--
						}
					}
					left++
				}
			}

			for _, ok := letterCount[rune(s[left])]; !ok; _, ok = letterCount[rune(s[left])] {
				left++
			}

			if currMatched == target {
				currLen := right - left + 1
				if minLen > currLen {
					resLeft = left
					resRight = right
					minLen = currLen
				}

				currLetterCount[rune(s[left])]--
				currMatched--
				left++
			}
		}

		right++
	}

	if minLen == math.MaxInt {
		return ""
	}
	return s[resLeft : resRight+1]
}
