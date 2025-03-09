package m274

import "sort"

// LeetCode 274
func hIndex(citations []int) int {
	sort.Sort(sort.Reverse(sort.IntSlice(citations)))
	res := 0
	for i, v := range citations {
		if i+1 <= v {
			res = i + 1
		} else {
			break
		}
	}
	return res
}
