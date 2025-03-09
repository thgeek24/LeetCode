package w424

import "math"

// LeetCode 3357
func minDifference(nums []int) int {
	maxAdj := 0
	minA := math.MaxInt
	maxB := 0
	for i := 0; i < len(nums)-1; i++ {
		a := nums[i]
		b := nums[i+1]
		if a > 0 && b > 0 {
			maxAdj = maxInt(maxAdj, abs(b-a))
		} else if a > 0 || b > 0 {
			minA = minInt(minA, maxInt(a, b))
			maxB = maxInt(maxB, maxInt(a, b))
		}
	}

	res := 0
	min2r := (maxB - minA + 2) / 3 * 2
	for i := 0; i < len(nums); i++ {
		if (i > 0 && nums[i-1] == -1) || nums[i] > 0 {
			continue
		}
		j := i
		for j < len(nums) && nums[j] == -1 {
			j++
		}
		a := math.MaxInt
		b := 0
		if i > 0 {
			a = minInt(a, nums[i-1])
			b = maxInt(b, nums[i-1])
		}
		if j < len(nums) {
			a = minInt(a, nums[j])
			b = maxInt(b, nums[j])
		}
		if j-i == 1 {
			res = maxInt(res, minInt(maxB-a, b-minA))
		} else {
			res = maxInt(res, minInt(maxB-a, minInt(b-minA, min2r)))
		}
	}
	return maxInt(maxAdj, (res+1)/2)
}

func maxInt(x, y int) int {
	if x > y {
		return x
	}
	return y
}

func minInt(x, y int) int {
	if x < y {
		return x
	}
	return y
}

func abs(num int) int {
	if num < 0 {
		return -num
	}
	return num
}
