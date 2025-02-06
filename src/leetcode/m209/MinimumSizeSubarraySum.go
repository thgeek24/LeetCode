package m209

import "math"

// LeetCode 209
func minSubArrayLen(target int, nums []int) int {
	slow, fast := 0, 1
	sum := nums[0]
	var minLen int
	if sum >= target {
		minLen = 1
	} else {
		minLen = math.MaxInt
	}

	for fast < len(nums) {
		for fast < len(nums) && sum < target {
			sum += nums[fast]
			fast++
		}
		for slow < fast && sum >= target {
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
