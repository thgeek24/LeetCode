package e88

import "sort"

// LeetCode 88
func merge(nums1 []int, m int, nums2 []int, n int) {
	for i, j := m, 0; i < len(nums1); i, j = i+1, j+1 {
		nums1[i] = nums2[j]
	}
	sort.Sort(sort.IntSlice(nums1))
}
