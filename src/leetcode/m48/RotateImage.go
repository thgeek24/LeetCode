package m48

// LeetCode 48
func rotate(matrix [][]int) {
	length := len(matrix)
	offset := length / 2
	for i := 0; i < offset; i++ {
		for j := i; j < length-i-1; j++ {
			m, n := i, j
			prev := matrix[m][n]
			for k := 0; k < 4; k++ {
				nextM := n
				nextN := length - m - 1
				temp := matrix[nextM][nextN]
				matrix[nextM][nextN] = prev
				prev = temp
				m = nextM
				n = nextN
			}
		}
	}
}
