package m238

// LeetCode 238
func productExceptSelf(nums []int) []int {
	nonZeroProd := 1
	zeroCnt := 0
	zeroIndex := -1
	res := make([]int, len(nums))
	for i, num := range nums {
		if num != 0 {
			nonZeroProd *= num
			continue
		}

		if zeroCnt == 0 {
			zeroIndex = i
			zeroCnt++
		} else {
			return res
		}
	}

	if zeroCnt == 1 {
		res[zeroIndex] = nonZeroProd
		return res
	}

	for i, num := range nums {
		res[i] = nonZeroProd / num
	}
	return res
}
