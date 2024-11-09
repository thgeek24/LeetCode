package m240

// LeetCode 240
func searchMatrix(matrix [][]int, target int) bool {
	// Start from the top-right corner
	row, col := 0, len(matrix[0])-1

	for row < len(matrix) && col >= 0 {
		if matrix[row][col] == target {
			return true
		} else if matrix[row][col] > target {
			col-- // Move left
		} else {
			row++ // Move down
		}
	}

	return false
}
