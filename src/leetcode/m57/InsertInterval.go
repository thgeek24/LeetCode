package m57

// LeetCode 57
func insert(intervals [][]int, newInterval []int) [][]int {
	res := make([][]int, 0)
	inserted := false
	for _, interval := range intervals {
		if !inserted {
			if interval[1] < newInterval[0] {
				res = append(res, interval)
				continue
			}
			if interval[0] > newInterval[1] {
				res = append(res, newInterval)
				res = append(res, interval)
				inserted = true
				continue
			}
			newInterval[0] = minInt(newInterval[0], interval[0])
			newInterval[1] = maxInt(newInterval[1], interval[1])
			continue
		}
		res = append(res, interval)
	}
	if !inserted {
		res = append(res, newInterval)
	}

	return res
}

func minInt(a, b int) int {
	if a < b {
		return a
	}
	return b
}

func maxInt(a, b int) int {
	if a < b {
		return b
	}
	return a
}
