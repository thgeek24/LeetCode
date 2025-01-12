package e26

// LeetCode 26
func removeDuplicates(nums []int) int {
	idx := 0
	numMap := make(map[int]int)
	for _, num := range nums {
		if _, ok := numMap[num]; !ok {
			numMap[num] = 1
			nums[idx] = num
			idx++
		}
	}
	return idx
}
