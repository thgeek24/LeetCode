package m30

// LeetCode 30
func findSubstring(s string, words []string) []int {
	wordLen := len(words[0])
	wordCnt := len(words)
	wordMap := make(map[string]int)
	for _, word := range words {
		if _, ok := wordMap[word]; ok {
			wordMap[word]++
		} else {
			wordMap[word] = 1
		}
	}

	_wordMap := make(map[string]int)
	for key, _ := range wordMap {
		_wordMap[key] = 0
	}
	_wordCnt := 0
	slow, fast := 0, 0
	res := make([]int, 0)
	for fast <= len(s)-wordLen {
		word := s[fast : fast+wordLen]
		if _, ok := _wordMap[word]; ok {
			_wordCnt++
			_wordMap[word]++
			fast += wordLen

			if _wordMap[word] == wordMap[word] && _wordCnt == wordCnt {
				res = append(res, slow)
				continue
			}

			for _wordMap[word] > wordMap[word] {
				slowWord := s[slow : slow+wordCnt]
				_wordMap[slowWord]--
				_wordCnt--
				slow += wordCnt
			}
			if _wordMap[word] == wordMap[word] && _wordCnt == wordCnt {
				res = append(res, slow)
			}
		} else {
			for key, _ := range _wordMap {
				_wordMap[key] = 0
			}
			_wordCnt = 0
			fast += wordLen
			slow = fast
		}
	}
	return res
}
