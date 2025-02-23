package e219

// LeetCode 219
func containsNearbyDuplicate(nums []int, k int) bool {
	numMap := make(map[int]int)
	for i, num := range nums {
		if index, exists := numMap[num]; exists {
			if i-index <= k {
				return true
			}
		}
		numMap[num] = i
	}
	return false
}
