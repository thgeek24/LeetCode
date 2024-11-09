package m240

// LeetCode 240
func searchMatrix(matrix [][]int, target int) bool {
	m := len(matrix)
	n := len(matrix[0])
	return searchMatrixHelper(matrix, []int{0, 0}, []int{m - 1, n - 1}, target)
}

func searchMatrixHelper(matrix [][]int, topLeft, btmRight []int, target int) bool {
	if topLeft[0] == btmRight[0] && topLeft[1] == btmRight[1] {
		return matrix[topLeft[0]][topLeft[1]] == target
	}
	rowOffset := btmRight[0] - topLeft[0]
	colOffset := btmRight[1] - topLeft[1]
	if rowOffset > colOffset {
		return searchMatrixHelper(matrix, topLeft, []int{topLeft[0] + colOffset, topLeft[1] + colOffset}, target) ||
			searchMatrixHelper(matrix, []int{topLeft[0] + colOffset + 1, topLeft[1]}, btmRight, target)
	} else if rowOffset < colOffset {
		return searchMatrixHelper(matrix, topLeft, []int{topLeft[0] + rowOffset, topLeft[1] + rowOffset}, target) ||
			searchMatrixHelper(matrix, []int{topLeft[0], topLeft[1] + rowOffset + 1}, btmRight, target)
	}

	low, found := searchDiagonal(matrix, topLeft, rowOffset, target)
	if found {
		return true
	}
	if low == rowOffset+1 || low == 0 {
		return false
	}

	return searchRow(matrix, topLeft[0]+low-1, topLeft[1]+low-1, btmRight[1], target) ||
		searchRow(matrix, topLeft[0]+low, topLeft[1], topLeft[1]+low, target) ||
		searchColumn(matrix, topLeft[1]+low-1, topLeft[0]+low-1, btmRight[0], target) ||
		searchColumn(matrix, topLeft[1]+low, topLeft[0], topLeft[0]+low, target)
}

func searchDiagonal(matrix [][]int, topLeft []int, rowOffset int, target int) (int, bool) {
	low, high := 0, rowOffset
	for low <= high {
		mid := low + (high-low)>>1
		i := mid + topLeft[0]
		j := mid + topLeft[1]
		if matrix[i][j] == target {
			return low, true
		} else if matrix[i][j] > target {
			high = mid - 1
		} else {
			low = mid + 1
		}
	}
	return low, false
}

func searchRow(matrix [][]int, row, colStart, colEnd, target int) bool {
	for colStart <= colEnd {
		mid := colStart + (colEnd-colStart)>>1
		if matrix[row][mid] == target {
			return true
		} else if matrix[row][mid] > target {
			colEnd = mid - 1
		} else {
			colStart = mid + 1
		}
	}

	return false
}

func searchColumn(matrix [][]int, col, rowStart, rowEnd, target int) bool {
	for rowStart <= rowEnd {
		mid := rowStart + (rowEnd-rowStart)>>1
		if matrix[mid][col] == target {
			return true
		} else if matrix[mid][col] > target {
			rowEnd = mid - 1
		} else {
			rowStart = mid + 1
		}
	}
	return false
}
