package e374

/**
 * LeetCode 374
 */
func guessNumber(n int) int {
	left := 0
	right := n
	for left < right {
		mid := left + (right-left)/2
		var guessRes int
		guessRes = guess(mid)
		if guessRes == 0 {
			return mid
		} else if guessRes > 0 {
			left = mid + 1
		} else {
			right = mid
		}
	}
	return left
}
