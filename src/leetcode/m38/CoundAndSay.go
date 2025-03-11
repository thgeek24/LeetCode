package m38

import (
	"strconv"
	"strings"
)

// LeetCode 38
func countAndSay(n int) string {
	res := "1"
	for i := 1; i < n; i++ {
		res = countString(res)
	}
	return res
}

func countString(n string) string {
	builder := make([]string, 0)
	digit := n[len(n)-1]
	count := 1
	for i := len(n) - 2; i >= 0; i-- {
		if n[i] == digit {
			count++
		} else {
			builder = append([]string{strconv.Itoa(count), string(digit)}, builder...)
			digit = n[i]
			count = 1
		}
	}
	builder = append([]string{strconv.Itoa(count), string(digit)}, builder...)
	return strings.Join(builder, "")
}
