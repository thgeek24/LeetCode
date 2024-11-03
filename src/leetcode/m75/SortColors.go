package m75

// LeetCode 75
func sortColors(nums []int) {
	redCnt := 0
	whiteCnt := 0
	blueCnt := 0
	for _, num := range nums {
		if num == 0 {
			redCnt++
		} else if num == 1 {
			whiteCnt++
		} else {
			blueCnt++
		}
	}
	for i, _ := range nums {
		if redCnt != 0 {
			nums[i] = 0
			redCnt--
		} else if whiteCnt != 0 {
			nums[i] = 1
			whiteCnt--
		} else {
			nums[i] = 2
			blueCnt--
		}
	}
}
