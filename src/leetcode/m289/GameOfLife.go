package m289

// LeetCode 289
func gameOfLife(board [][]int) {
	switched := make([][]int, 0)
	for i := 0; i < len(board); i++ {
		for j := 0; j < len(board[0]); j++ {
			coords := []int{i, j}
			neighbors := countNeighbors(board, coords)
			if board[i][j] == 1 {
				if neighbors < 2 || neighbors > 3 {
					switched = append(switched, coords)
				}
			} else if neighbors == 3 {
				switched = append(switched, coords)
			}
		}
	}

	for _, sw := range switched {
		board[sw[0]][sw[1]] ^= 1
	}
}

func countNeighbors(board [][]int, coords []int) int {
	count := 0
	directions := [][]int{{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}}
	for _, dir := range directions {
		x := coords[0] + dir[0]
		y := coords[1] + dir[1]
		if x >= 0 && x < len(board) && y >= 0 && y < len(board[0]) && board[x][y] == 1 {
			count++
		}
	}
	return count
}
