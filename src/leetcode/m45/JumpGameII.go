package m45

import "math"

// LeetCode 45
type JumpGameII interface {
	Jump(nums []int) int
}

type Solution1 struct {
}

func (s Solution1) Jump(nums []int) int {
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

type Solution2 struct {
}

func (s Solution2) Jump(nums []int) int {
	maxPos := 0
	currEnd := 0
	jumps := 0

	for i := 0; i < len(nums)-1; i++ {
		maxPos = maxInt(maxPos, i+nums[i])

		if i == currEnd {
			jumps++
			currEnd = maxPos
			if currEnd >= len(nums)-1 {
				break
			}
		}
	}
	return jumps
}

func maxInt(a, b int) int {
	if a > b {
		return a
	}
	return b
}
