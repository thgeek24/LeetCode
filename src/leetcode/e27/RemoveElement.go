package e27

// LeetCode 27
func removeElement(nums []int, val int) int {
	idx := 0
	for _, num := range nums {
		if num != val {
			nums[idx] = num
			idx++
		}
	}
	return idx
}
