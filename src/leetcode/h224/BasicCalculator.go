package h224

// LeetCode 224
func calculate(s string) int {
	stack := make([]int, 0)
	res, sign := 0, 1
	n := len(s)
	i := 0

	for i < n {
		c := s[i]
		switch c {
		case ' ':
		case '+':
			sign = 1
		case '-':
			sign = -1
		case '(':
			stack = append(stack, res)
			stack = append(stack, sign)
			res, sign = 0, 1
		case ')':
			if len(stack) > 0 {
				prevSign := stack[len(stack)-1]
				stack = stack[:len(stack)-1]
				prevRes := stack[len(stack)-1]
				stack = stack[:len(stack)-1]
				res = prevRes + prevSign*res
			}
		default:
			num := 0
			for i < n && s[i] >= '0' && s[i] <= '9' {
				num = num*10 + int(s[i]-'0')
				i++
			}
			res += num * sign
			continue
		}
		i++
	}

	return res
}
