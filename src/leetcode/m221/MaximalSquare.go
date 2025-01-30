package m221

// LeetCode 221
func maximalSquare(matrix [][]byte) int {
	m, n := len(matrix), len(matrix[0])
	dp := make([][]int, m+1)
	for i := range dp {
		dp[i] = make([]int, n+1)
	}

	side := 0
	for i := 1; i <= m; i++ {
		for j := 1; j <= n; j++ {
			if matrix[i-1][j-1] == '1' {
				dp[i][j] = minInt(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + 1
				if dp[i][j] > side {
					side = dp[i][j]
				}
			}
		}
	}

	return side * side
}

func minInt(a, b, c int) int {
	if a < b {
		if a < c {
			return a
		}
		return c
	}

	if b < c {
		return b
	}
	return c
}
