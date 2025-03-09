package w423

// LeetCode 3352
func countKReducibleNumbers(s string, k int) int {
	const mod = 1_000_000_007
	n := len(s)
	dp := make([]int, n+1)
	dp[0] = k + 1
	for i := 2; i <= n; i++ {
		dp[i] = dp[bitCount(i)] + 1
	}

	c := make([][]int, n)
	for i := 0; i < n; i++ {
		c[i] = make([]int, n)
		for j := 0; j <= i; j++ {
			if i == 0 || j == 0 {
				c[i][j] = 1
			} else {
				c[i][j] = (c[i-1][j-1] + c[i-1][j]) % mod
			}
		}
	}

	res := 0
	setBits := 0
	for i, elem := range s {
		if elem == '0' {
			continue
		}
		r := n - i - 1
		for j := 0; j <= r; j++ {
			if dp[setBits+j] >= k {
				continue
			}
			res = (res + c[r][j]) % mod
		}
		setBits++
	}
	return res
}

func bitCount(num int) int {
	count := 0
	for ; num > 0; num >>= 1 {
		if num&1 == 1 {
			count++
		}
	}
	return count
}
