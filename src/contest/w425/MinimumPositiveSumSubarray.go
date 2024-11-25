package w425

import "math"

// LeetCode 3364
func minimumSumSubarray(nums []int, l int, r int) int {
	minSum := math.MaxInt32
	n := len(nums)
	for i := 0; i <= n-l; i++ {
		sum := 0
		j := i
		for ; j < n && j < i+l; j++ {
			sum += nums[j]
		}
		if sum > 0 {
			minSum = minInt(minSum, sum)
		}
		for ; j < n && j < i+r; j++ {
			sum += nums[j]
			if sum > 0 {
				minSum = minInt(minSum, sum)
			}
		}
	}
	if minSum == math.MaxInt32 {
		return -1
	}
	return minSum
}

func minInt(a, b int) int {
	if a < b {
		return a
	}
	return b
}
