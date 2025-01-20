package m300

// LeetCode 300
func lengthOfLIS(nums []int) int {
	dp := make([]int, len(nums))
	dp[0] = 1
	res := 1
	for i := 1; i < len(nums); i++ {
		for j := 0; j < i; j++ {
			if nums[j] < nums[i] {
				dp[i] = maxInt(dp[i], dp[j])
			}
		}
		dp[i]++
		res = maxInt(dp[i], res)
	}
	return res
}

func maxInt(a, b int) int {
	if a < b {
		return b
	} else {
		return a
	}
}
