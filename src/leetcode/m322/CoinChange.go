package m322

import (
	"sort"
)

// LeetCode 322
func coinChange(coins []int, amount int) int {
	dp := make([]int, amount+1)
	for i := 1; i <= amount; i++ {
		dp[i] = amount + 1
	}
	sort.Ints(coins)
	for i := 1; i <= amount; i++ {
		for _, coin := range coins {
			if coin > i {
				break
			}
			dp[i] = minInt(dp[i], dp[i-coin]+1)
		}
	}

	if dp[amount] == amount+1 {
		return -1
	}
	return dp[amount]
}

func minInt(a, b int) int {
	if a < b {
		return a
	} else {
		return b
	}
}
