package m31

func nextPermutation(nums []int) {
	n := len(nums)
	n -= 2

	for ; n >= 0; n-- {
		if nums[n] < nums[n+1] {
			break
		}
	}

	if n >= 0 {
		for i := len(nums) - 1; i > n; i-- {
			if nums[i] > nums[n] {
				swap(nums, i, n)
				break
			}
		}
	}

	reverse(nums, n+1)
}

func reverse(nums []int, i int) {
	for j := len(nums) - 1; i < j; i, j = i+1, j-1 {
		swap(nums, i, j)
	}
}

func swap(nums []int, i int, n int) {
	nums[i], nums[n] = nums[n], nums[i]
}
