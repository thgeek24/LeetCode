package h149

import (
	"fmt"
)

func maxPoints(points [][]int) int {
	if len(points) < 2 {
		return 1
	}

	maxPoints := 0
	for i, point := range points {
		slopeMap := make(map[string]int)
		duplicates := 0
		localMax := 0
		for j := i + 1; j < len(points); j++ {
			candidate := points[j]
			dx := candidate[0] - point[0]
			dy := candidate[1] - point[1]
			if dx == 0 && dy == 0 {
				duplicates++
				continue
			}

			gcd := gcd(dx, dy)
			dx /= gcd
			dy /= gcd

			slope := fmt.Sprintf("%d/%d", dx, dy)
			value, exists := slopeMap[slope]
			if exists {
				slopeMap[slope] = value + 1
			} else {
				slopeMap[slope] = 1
			}
			localMax = maxInt(localMax, slopeMap[slope]+duplicates+1)
		}
		maxPoints = maxInt(maxPoints, localMax)
	}
	return maxPoints
}

func gcd(a, b int) int {
	if b == 0 {
		return a
	}
	return gcd(b, a%b)
}

func maxInt(a, b int) int {
	if a > b {
		return a
	}
	return b
}
