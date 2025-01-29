package m300

// LongestIncreasingSubsequence LeetCode 300
type LongestIncreasingSubsequence interface {
	lengthOfLIS(nums []int) int
}

type Solution1 struct {
}

func (s1 Solution1) lengthOfLIS(nums []int) int {
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

type Solution2 struct {
}

func (s1 Solution2) lengthOfLIS(nums []int) int {
	dp := make([]int, len(nums))
	size := 0

	for _, num := range nums {
		i, j := 0, size
		for i != j {
			mid := (i + j) / 2
			if dp[mid] < num {
				i = mid + 1
			} else {
				j = mid
			}
		}
		dp[i] = num
		if i == size {
			size++
		}
	}
	return size
}
