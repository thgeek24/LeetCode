package m377

import "sort"

// LeetCode 377
func combinationSum4(nums []int, target int) int {
	sort.Ints(nums)
	dp := make([]int, target+1)
	dp[0] = 1
	for i := 1; i <= target; i++ {
		for _, num := range nums {
			if num > i {
				break
			} else {
				dp[i] += dp[i-num]
			}
		}
	}

	return dp[target]
}
