package e1

// LeetCode 1
func twoSum(nums []int, target int) []int {
	numsMap := make(map[int]int)
	for i, num1 := range nums {
		num2 := target - num1
		if j, exists := numsMap[num2]; exists {
			return []int{j, i}
		}
		numsMap[num1] = i
	}
	return []int{}
}
