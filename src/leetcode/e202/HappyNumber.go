package e202

// LeetCode 202
func isHappy(n int) bool {
	fast := n
	for {
		fast = digitSquares(fast)
		if fast == 1 {
			return true
		}
		if fast == 4 {
			break
		}
	}
	return false
}

func digitSquares(n int) int {
	sum := 0
	for n > 0 {
		m := n % 10
		sum += m * m
		n /= 10
	}
	return sum
}
