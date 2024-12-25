package m45

import "math"

func jump(nums []int) int {
	n := len(nums)
	dp := make([]int, n)
	for i := range dp {
		dp[i] = math.MaxInt
	}
	dp[0] = 0

	for i := 0; i < n; i++ {
		for j := 1; j <= nums[i]; j++ {
			if i+j < n {
				dp[i+j] = minInt(dp[i+j], dp[i]+1)
			}
		}
	}
	return dp[n-1]
}

func minInt(a, b int) int {
	if a < b {
		return a
	}
	return b
}
