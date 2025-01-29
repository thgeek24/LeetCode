package h188

// LeetCode 188
func maxProfit(k int, prices []int) int {
	n := len(prices)
	dp := make([][][]int, n)
	for i := range dp {
		dp[i] = make([][]int, k+1)
		for j := range dp[i] {
			dp[i][j] = make([]int, 2)
		}
	}

	for i := 0; i < n; i++ {
		for j := 1; j <= k; j++ {
			if i == 0 {
				dp[i][j][0] = 0
				dp[i][j][1] = -prices[i]
				continue
			}
			dp[i][j][0] = maxInt(dp[i-1][j][0], dp[i-1][j][1]+prices[i])
			dp[i][j][1] = maxInt(dp[i-1][j][1], dp[i-1][j-1][0]-prices[i])
		}
	}
	return dp[n-1][k][0]
}

func maxInt(a, b int) int {
	if a < b {
		return b
	}
	return a
}
