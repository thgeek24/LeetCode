package h42

/**
 * LeetCode 42
 */
func trap(height []int) int {
	left := 0
	right := len(height) - 1
	leftMax := 0
	rightMax := 0
	trapped := 0

	for left < right {
		if height[left] > height[right] {
			bar := min(height[left], rightMax)
			if bar > height[right] {
				trapped += bar - height[right]
			}
			rightMax = max(height[right], rightMax)
			right--
		} else {
			bar := min(height[right], leftMax)
			if bar > height[left] {
				trapped += bar - height[left]
			}
			leftMax = max(height[left], leftMax)
			left++
		}
	}
	return trapped
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
