package w424

// LeetCode 3356
func minZeroArray(nums []int, queries [][]int) int {
	l := 0
	r := len(queries) + 1
	for l < r {
		mid := l + (r-l)/2
		if isZeroArray(nums, queries, mid) {
			r = mid
		} else {
			l = mid + 1
		}
	}

	if l <= len(queries) {
		return l
	} else {
		return -1
	}
}

func isZeroArray(nums []int, queries [][]int, k int) bool {
	line := make([]int, len(nums)+1)
	for i := 0; i < k; i++ {
		line[queries[i][0]] += queries[i][2]
		line[queries[i][1]+1] -= queries[i][2]
	}

	curr := 0
	for i := 0; i < len(nums); i++ {
		curr += line[i]
		if nums[i] > curr {
			return false
		}
	}
	return true
}
