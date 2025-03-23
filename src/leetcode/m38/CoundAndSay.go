package m38

import "strconv"

// LeetCode 38
func countAndSay(n int) string {
	if n == 1 {
		return "1"
	}

	prev := countAndSay(n - 1)
	res := ""
	count := 1
	for i := 1; i < len(prev); i++ {
		if prev[i] == prev[i-1] {
			count++
		} else {
			res += strconv.Itoa(count) + string(prev[i-1])
			count = 1
		}
	}
	res += strconv.Itoa(count) + string(prev[len(prev)-1])
	return res
}
