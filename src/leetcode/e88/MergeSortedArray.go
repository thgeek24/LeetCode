package e88

// LeetCode 88
func merge(nums1 []int, m int, nums2 []int, n int) {
	res := make([]int, len(nums1))
	idx, i, j := 0, 0, 0
	for i < m && j < n {
		if nums1[i] <= nums2[j] {
			res[idx] = nums1[i]
			idx++
			i++
		} else {
			res[idx] = nums2[j]
			idx++
			j++
		}
	}

	for i < m {
		res[idx] = nums1[i]
		idx++
		i++
	}
	for j < n {
		res[idx] = nums2[j]
		idx++
		j++
	}
	copy(nums1, res)
}
