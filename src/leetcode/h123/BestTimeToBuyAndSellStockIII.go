package h123

// LeetCode 123
func maxProfit(prices []int) int {
	days := len(prices)
	// Create a slice of size `m` for the first dimension
	dp := make([][][]int, days)

	// Initialize the 2nd and 3rd dimensions for each "row"
	for i := range dp {
		dp[i] = make([][]int, 3) // Fixed size for the 2nd dimension
		for j := range dp[i] {
			dp[i][j] = make([]int, 2) // Fixed size for the 3rd dimension
		}
	}

	// dp[i][j][0] means the max profit on day i at transaction j if noting holding the stock
	// dp[i][j][1] means the max profit on day i at transaction j if holding the stock
	for i := 0; i < days; i++ {
		for j := 1; j < 3; j++ {
			if i == 0 {
				dp[i][j][0] = 0
				dp[i][j][1] = -prices[i]
				continue
			}
			dp[i][j][0] = maxInt(dp[i-1][j][0], dp[i-1][j][1]+prices[i])
			dp[i][j][1] = maxInt(dp[i-1][j][1], dp[i-1][j-1][0]-prices[i])
		}
	}
	return dp[days-1][2][0]
}

func maxInt(a, b int) int {
	if a > b {
		return a
	}
	return b
}
