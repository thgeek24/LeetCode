package main

import "strings"

// LeetCode 6
func convert(s string, numRows int) string {
	if numRows == 1 {
		return s
	}
	builders := make([]strings.Builder, numRows)

	row := 0
	goingDown := false
	for i := 0; i < len(s); i++ {
		builders[row].WriteByte(s[i])
		if row == 0 || row == numRows-1 {
			goingDown = !goingDown
		}
		if goingDown {
			row++
		} else {
			row--
		}
	}

	var res strings.Builder
	for _, builder := range builders {
		res.WriteString(builder.String())
	}
	return res.String()
}
