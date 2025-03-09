package m189

// Rotator interface
type Rotator interface {
	Rotate(nums []int, k int)
}

// Solution1 implements Rotator interface
type Solution1 struct{}

func (s Solution1) Rotate(nums []int, k int) {
	n := len(nums)
	k = k % n
	res := make([]int, n)
	for i := 0; i < n-k; i++ {
		res[i+k] = nums[i]
	}
	j := 0
	for i := n - k; i < n; i++ {
		res[j] = nums[i]
		j++
	}
	copy(nums, res)
}

// Solution2 implements Rotator interface
type Solution2 struct{}

func (s Solution2) Rotate(nums []int, k int) {
	n := len(nums)
	k = k % n

	reverse(nums, 0, n-1)
	reverse(nums, 0, k-1)
	reverse(nums, k, n-1)
}

func reverse(nums []int, start, end int) {
	for start < end {
		nums[start], nums[end] = nums[end], nums[start]
		start++
		end--
	}
}
