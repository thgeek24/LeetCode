package m18

import (
	"sort"
)

// LeetCode 18
func fourSum(nums []int, target int) [][]int {
	sort.Sort(sort.IntSlice(nums))
	res := make([][]int, 0)
	for i := 0; i < len(nums)-3; i++ {
		for i > 0 && nums[i] == nums[i-1] && i < len(nums)-3 {
			i++
		}
		if i == len(nums)-3 {
			break
		}

		first := nums[i]
		threeSums := threeSum(nums[i+1:], target-first)
		for j := range threeSums {
			item := append(threeSums[j], first)
			res = append(res, item)
		}
	}
	return res
}

func threeSum(nums []int, target int) [][]int {
	res := make([][]int, 0)
	for i := 0; i < len(nums)-2; i++ {
		for i > 0 && nums[i] == nums[i-1] && i < len(nums)-2 {
			i++
		}
		if i == len(nums)-2 {
			break
		}

		second := nums[i]
		threeSums := twoSum(nums[i+1:], target-second)
		for j := range threeSums {
			item := append(threeSums[j], second)
			res = append(res, item)
		}
	}

	return res
}

func twoSum(nums []int, target int) [][]int {
	res := make([][]int, 0)
	left := 0
	right := len(nums) - 1
	for left < right {
		for left > 0 && nums[left] == nums[left-1] && left < right {
			left++
		}
		for right < len(nums)-1 && nums[right] == nums[right+1] && left < right {
			right--
		}
		if left == right {
			break
		}

		sum := nums[left] + nums[right]
		if sum == target {
			res = append(res, []int{nums[left], nums[right]})
			left++
			right--
		} else if sum > target {
			right--
		} else {
			left++
		}
	}
	return res
}
