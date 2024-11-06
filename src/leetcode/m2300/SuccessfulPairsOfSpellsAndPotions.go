package m2300

import "sort"

// LeetCode 2300
func successfulPairs(spells []int, potions []int, success int64) []int {
	n := len(spells)
	res := make([]int, n)

	sort.Ints(potions)
	for i, spell := range spells {
		_spell := int64(spell)
		requiredPotion := (success + _spell - 1) / _spell

		left, right := 0, len(potions)-1
		for left <= right {
			mid := left + (right-left)>>1
			if int64(potions[mid]) < requiredPotion {
				left = mid + 1
			} else {
				right = mid - 1
			}
		}
		res[i] = len(potions) - left
	}

	return res
}
