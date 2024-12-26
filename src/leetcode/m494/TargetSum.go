package m494

// LeetCode 494
func findTargetSumWays(nums []int, target int) int {
	sumMap := make(map[int]int)

	for _, num := range nums {
		tmpMap := make(map[int]int)
		if len(sumMap) == 0 {
			tmpMap[num]++
			tmpMap[-num]++
		} else {
			for sum, count := range sumMap {
				tmpMap[sum+num] += count
				tmpMap[sum-num] += count
			}
		}
		sumMap = tmpMap
	}
	return sumMap[target]
}
