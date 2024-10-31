package m334

import "math"

// LeetCode 334
func increasingTriplet(nums []int) bool {
	first := math.MaxInt16
	second := math.MaxInt16

	for _, num := range nums {
		if num <= first {
			first = num
		} else if num <= second {
			second = num
		} else {
			return true
		}
	}
	return false
}
