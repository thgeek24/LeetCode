package m16

import (
	"math"
	"sort"
)

// LeetCode 16
func threeSumClosest(nums []int, target int) int {
	sort.Ints(nums)
	arrLen := len(nums)

	closestSum := math.MaxInt32
	for i := 0; i < arrLen-2; i++ {
		left, right := i+1, arrLen-1
		for left < right {
			sum := nums[i] + nums[left] + nums[right]
			if sum == target {
				return sum
			} else if sum > target {
				right--
			} else {
				left++
			}
			if abs(sum-target) < abs(closestSum-target) {
				closestSum = sum
			}
		}
	}
	return closestSum
}

func abs(a int) int {
	if a < 0 {
		return -a
	}
	return a
}
