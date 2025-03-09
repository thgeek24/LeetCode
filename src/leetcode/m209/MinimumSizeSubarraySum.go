package m209

import "math"

// LeetCode 209
func minSubArrayLen(target int, nums []int) int {
	slow, fast := 0, 0
	sum := 0
	minLen := math.MaxInt
	for fast < len(nums) {
		sum += nums[fast]
		fast++

		for sum >= target {
			minLen = minInt(minLen, fast-slow)
			sum -= nums[slow]
			slow++
		}
	}

	if minLen == math.MaxInt {
		return 0
	}
	return minLen
}

func minInt(a, b int) int {
	if a < b {
		return a
	}
	return b
}
