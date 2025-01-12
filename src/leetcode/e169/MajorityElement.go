package e169

// LeetCode 169
func majorityElement(nums []int) int {
	target := len(nums) / 2
	numMap := make(map[int]int)

	for _, num := range nums {
		if _, ok := numMap[num]; !ok {
			numMap[num] = 1
		} else {
			numMap[num]++
		}
		if numMap[num] > target {
			return num
		}
	}
	return 0
}
