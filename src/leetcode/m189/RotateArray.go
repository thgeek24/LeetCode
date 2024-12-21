package m189

// LeetCode 189
func rotate(nums []int, k int) {
	n := len(nums)
	k = k % n
	res := make([]int, n)
	for i := 0; i < n-k; i++ {
		res[i+k] = nums[i]
	}
	j := 0
	for i := n - k; i < n; i++ {
		res[j] = nums[i]
		j++
	}
	copy(nums, res)
}
