package m787

import "math"

// LeetCode 787
func findCheapestPrice(n int, flights [][]int, src int, dst int, k int) int {
	costs := make([]int, n)
	for i := range costs {
		costs[i] = math.MaxInt
	}
	costs[src] = 0

	for i := 0; i <= k; i++ {
		temp := make([]int, n)
		copy(temp, costs)
		for _, flight := range flights {
			f, t, p := flight[0], flight[1], flight[2]
			if costs[f] != math.MaxInt && temp[t] > costs[f]+p {
				temp[t] = costs[f] + p
			}
		}
		costs = temp
	}

	if costs[dst] == math.MaxInt {
		return -1
	}
	return costs[dst]
}
