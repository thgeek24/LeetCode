package main

import (
	"strings"
)

// LeetCode 68
func fullJustify(words []string, maxWidth int) []string {
	var strArr [][]string

	line := make([]string, 0)
	lineLen := 0
	for _, word := range words {
		if lineLen == 0 {
			line = append(line, word)
			lineLen += len(word)
		} else if lineLen+len(word)+1 <= maxWidth {
			line = append(line, word)
			lineLen += len(word) + 1
		} else {
			strArr = append(strArr, line)
			line = make([]string, 0)
			line = append(line, word)
			lineLen = len(word)
		}
	}
	strArr = append(strArr, line)

	var res []string
	for i, line := range strArr {
		isLastLine := i == len(strArr)-1
		res = append(res, concatWords(line, maxWidth, isLastLine))
	}
	return res
}

func concatWords(words []string, targetWidth int, isLastLine bool) string {
	if len(words) == 1 || isLastLine {
		var builder strings.Builder
		builder.WriteString(strings.Join(words, " "))
		currLen := builder.Len()
		builder.WriteString(strings.Repeat(" ", targetWidth-currLen))
		return builder.String()
	}

	totalLen := 0
	for _, word := range words {
		totalLen += len(word)
	}
	totalGap := targetWidth - totalLen
	avgGap := totalGap / (len(words) - 1)
	remainder := totalGap % (len(words) - 1)

	var builder strings.Builder
	for i, word := range words {
		if i == len(words)-1 {
			builder.WriteString(word)
			break
		}
		builder.WriteString(word)
		spaceLen := avgGap
		if i < remainder {
			spaceLen++
		}
		whiteSpaces := strings.Repeat(" ", spaceLen)
		builder.WriteString(whiteSpaces)
	}

	return builder.String()
}
