package m120

// LeetCode 120
func minimumTotal(triangle [][]int) int {
	dp := make([]int, len(triangle))
	dp[0] = triangle[0][0]
	for i := 1; i < len(triangle); i++ {
		row := triangle[i]
		for j := 0; j < len(row); j++ {
			if j == 0 {
				row[0] += dp[0]
			} else if j == len(row)-1 {
				row[j] += dp[j-1]
			} else {
				row[j] = minInt(row[j]+dp[j-1], row[j]+dp[j])
			}
		}
		copy(dp, row)
	}

	res := dp[0]
	for i := 1; i < len(dp); i++ {
		res = minInt(res, dp[i])
	}
	return res
}

func minInt(a, b int) int {
	if a < b {
		return a
	}
	return b
}
