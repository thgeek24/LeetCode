package m150

import "strconv"

// LeetCode 150
func evalRPN(tokens []string) int {
	stack := make([]string, 0)
	operators := map[string]struct{}{
		"+": {},
		"-": {},
		"*": {},
		"/": {},
	}
	for _, token := range tokens {
		if _, exists := operators[token]; exists {
			first := stack[len(stack)-2]
			second := stack[len(stack)-1]
			stack = stack[:len(stack)-2]
			firstNum, _ := strconv.Atoi(first)
			secondNum, _ := strconv.Atoi(second)
			if token == "+" {
				stack = append(stack, strconv.Itoa(firstNum+secondNum))
			} else if token == "-" {
				stack = append(stack, strconv.Itoa(firstNum-secondNum))
			} else if token == "*" {
				stack = append(stack, strconv.Itoa(firstNum*secondNum))
			} else {
				stack = append(stack, strconv.Itoa(firstNum/secondNum))
			}
		} else {
			stack = append(stack, token)
		}
	}
	res, _ := strconv.Atoi(stack[0])
	return res
}
