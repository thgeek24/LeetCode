package m1091

import "math"

var directions = [8][2]int{
	{0, 1},
	{1, 0},
	{0, -1},
	{-1, 0},
	{1, 1},
	{1, -1},
	{-1, 1},
	{-1, -1},
}

// LeetCode 1091
func shortestPathBinaryMatrix(grid [][]int) int {
	n := len(grid)
	dp := make([][]int, n)
	for i := range dp {
		dp[i] = make([]int, n)
		for j := 0; j < n; j++ {
			dp[i][j] = math.MaxInt
		}
	}

	queue := make([][]int, 0)
	if grid[0][0] == 0 {
		dp[0][0] = 1
		for _, dir := range directions {
			x, y := dir[0], dir[1]
			if isReachable(grid, x, y) {
				queue = append(queue, []int{x, y, 2})
			}
		}
	}

	for len(queue) != 0 {
		pos := queue[0]
		queue = queue[1:]
		if dp[pos[0]][pos[1]] > pos[2] {
			dp[pos[0]][pos[1]] = pos[2]
			for _, dir := range directions {
				x, y := pos[0]+dir[0], pos[1]+dir[1]
				if isReachable(grid, x, y) {
					queue = append(queue, []int{x, y, pos[2] + 1})
				}
			}
		}
	}

	if dp[n-1][n-1] == math.MaxInt {
		return -1
	}
	return dp[n-1][n-1]
}

func isReachable(grid [][]int, x, y int) bool {
	if x < 0 || x >= len(grid) || y < 0 || y >= len(grid) || grid[x][y] == 1 {
		return false
	}
	return true
}
