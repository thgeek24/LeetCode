package m743

import "math"

// LeetCode 743
func networkDelayTime(times [][]int, n int, k int) int {
	timeMap := make(map[int][][]int)
	for _, time := range times {
		node := time[0]
		timeMap[node] = append(timeMap[node], time)
	}

	minTimes := make([]int, n+1)
	for i := range minTimes {
		minTimes[i] = -1
	}
	minTimes[k] = 0
	queue := make([]int, 0)
	queue = append(queue, k)
	for len(queue) > 0 {
		source := queue[0]
		queue = queue[1:]

		travelTimes := timeMap[source]
		for _, travelTime := range travelTimes {
			target := travelTime[1]
			receiveTime := minTimes[source] + travelTime[2]

			if minTimes[target] == -1 {
				minTimes[target] = receiveTime
				queue = append(queue, target)
			} else {
				if receiveTime < minTimes[target] {
					minTimes[target] = receiveTime
					queue = append(queue, target)
				}
			}
		}
	}

	res := math.MinInt
	for i := 1; i <= n; i++ {
		if minTimes[i] == -1 {
			return -1
		}
		if minTimes[i] > res {
			res = minTimes[i]
		}
	}
	return res
}
