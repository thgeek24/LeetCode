package e26

// LeetCode 26
type RemoveDuplicatesFromSortedArray interface {
	removeDuplicates(nums []int) int
}

type Solution1 struct {
}

func (s Solution1) removeDuplicates(nums []int) int {
	idx := 1
	prev := nums[0]
	for i := 1; i < len(nums); i++ {
		if nums[i] != prev {
			nums[idx] = nums[i]
			prev = nums[i]
			idx++
		}
	}
	return idx
}

type Solution2 struct {
}

func (s Solution2) removeDuplicates(nums []int) int {
	idx := 0
	numMap := make(map[int]int)
	for _, num := range nums {
		if _, ok := numMap[num]; !ok {
			numMap[num] = 1
			nums[idx] = num
			idx++
		}
	}
	return idx
}
