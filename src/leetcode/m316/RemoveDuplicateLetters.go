package m316

import "strings"

// LeetCode 316
func removeDuplicateLetters(s string) string {
	freq := make([]int, 26)
	for _, c := range s {
		freq[c-'a']++
	}
	visited := make([]bool, 26)

	stack := make([]rune, 0)
	for _, c := range s {
		freq[c-'a']--
		if visited[c-'a'] {
			continue
		}

		for len(stack) > 0 && c < stack[len(stack)-1] && freq[stack[len(stack)-1]-'a'] > 0 {
			top := stack[len(stack)-1]
			stack = stack[:len(stack)-1]
			visited[top-'a'] = false
		}
		stack = append(stack, c)
		visited[c-'a'] = true
	}

	var builder strings.Builder
	for _, c := range stack {
		builder.WriteRune(c)
	}
	return builder.String()
}
