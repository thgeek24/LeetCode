package e228

import "strconv"

// LeetCode 228
func summaryRanges(nums []int) []string {
	res := make([]string, 0)
	if len(nums) == 0 {
		return res
	}

	start := nums[0]
	for i := 0; i < len(nums)-1; i++ {
		curr := nums[i]
		next := nums[i+1]
		if curr == next-1 {
			continue
		}

		if curr == start {
			res = append(res, strconv.Itoa(start))
		} else {
			res = append(res, strconv.Itoa(start)+"->"+strconv.Itoa(curr))
		}
		start = next
	}
	if start == nums[len(nums)-1] {
		res = append(res, strconv.Itoa(start))
	} else {
		res = append(res, strconv.Itoa(start)+"->"+strconv.Itoa(nums[len(nums)-1]))
	}

	return res
}
