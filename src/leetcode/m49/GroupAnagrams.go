package m49

import "sort"

// LeetCode 49
func groupAnagrams(strs []string) [][]string {
	wordMap := make(map[string][]int)
	for i, word := range strs {
		sorted := sortLetters(word)
		wordMap[sorted] = append(wordMap[sorted], i)
	}
	res := make([][]string, 0)
	for _, indexes := range wordMap {
		words := make([]string, 0)
		for _, index := range indexes {
			words = append(words, strs[index])
		}
		res = append(res, words)
	}
	return res
}

func sortLetters(word string) string {
	runes := []rune(word)
	sort.Slice(runes, func(i, j int) bool {
		return runes[i] < runes[j]
	})
	return string(runes)
}
