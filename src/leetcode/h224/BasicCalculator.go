package h224

// LeetCode 224
func calculate(s string) int {
	var stack []int
	result, sign := 0, 1
	n := len(s)
	i := 0

	for i < n {
		ch := s[i]
		switch ch {
		case ' ':
			// Skip spaces
		case '+':
			sign = 1
		case '-':
			sign = -1
		case '(':
			// Push the current result and sign onto the stack
			stack = append(stack, result)
			stack = append(stack, sign)
			// Reset result and sign for the new sub-expression
			result, sign = 0, 1
		case ')':
			// Pop the sign and previous result from the stack
			if len(stack) > 0 {
				prevSign := stack[len(stack)-1]
				stack = stack[:len(stack)-1]
				prevResult := stack[len(stack)-1]
				stack = stack[:len(stack)-1]
				result = prevResult + prevSign*result
			}
		default:
			// If the character is a digit, accumulate the number.
			if ch >= '0' && ch <= '9' {
				num := 0
				for i < n && s[i] >= '0' && s[i] <= '9' {
					num = num*10 + int(s[i]-'0')
					i++
				}
				result += sign * num
				// Continue here to avoid extra i++ since we already moved i in the inner loop.
				continue
			}
		}
		i++
	}

	return result
}
