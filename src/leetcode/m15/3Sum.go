package m15

import (
	"sort"
)

// LeetCode 15
func threeSum(nums []int) [][]int {
	sort.Sort(sort.IntSlice(nums))
	res := make([][]int, 0)
	for i := 0; i < len(nums)-2; i++ {
		if i == 0 || nums[i] != nums[i-1] {
			left, right := i+1, len(nums)-1
			sum := -nums[i]
			for left < right {
				if nums[left]+nums[right] == sum {
					res = append(res, []int{nums[i], nums[left], nums[right]})
					for left < right && nums[left] == nums[left+1] {
						left++
					}
					for left < right && nums[right] == nums[right-1] {
						right--
					}
					left++
					right--
				} else if nums[left]+nums[right] > sum {
					right--
				} else {
					left++
				}
			}
		}
	}
	return res
}
