package m36

// LeetCode 36
func isValidSudoku(board [][]byte) bool {
	byteMap := make(map[byte]int)
	for _, row := range board {
		for _, digit := range row {
			if digit == '.' {
				continue
			}
			if count, exists := byteMap[digit]; exists && count == 1 {
				return false
			} else {
				byteMap[digit]++
			}
		}
		byteMap = make(map[byte]int)
	}

	for j := 0; j < 9; j++ {
		for i := 0; i < 9; i++ {
			digit := board[i][j]
			if digit == '.' {
				continue
			}
			if count, exists := byteMap[digit]; exists && count == 1 {
				return false
			} else {
				byteMap[digit]++
			}
		}
		byteMap = make(map[byte]int)
	}

	for i := 0; i < 9; i += 3 {
		for j := 0; j < 9; j += 3 {
			for m := i; m < i+3; m++ {
				for n := j; n < j+3; n++ {
					digit := board[m][n]
					if digit == '.' {
						continue
					}
					if count, exists := byteMap[digit]; exists && count == 1 {
						return false
					} else {
						byteMap[digit]++
					}
				}
			}
			byteMap = make(map[byte]int)
		}
	}
	return true
}
