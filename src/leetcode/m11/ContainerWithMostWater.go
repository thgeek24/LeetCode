package m11

// LeetCode 11
func maxArea(height []int) int {
	res := 0
	for i, j := 0, len(height)-1; i < j; {
		var minHeight int
		if height[i] < height[j] {
			minHeight = height[i]
			i++
		} else {
			minHeight = height[j]
			j--
		}

		res = maxInt(minHeight*(j-i+1), res)
	}
	return res
}

func maxInt(a, b int) int {
	if a < b {
		return b
	}
	return a
}
