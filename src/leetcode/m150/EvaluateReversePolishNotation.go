package m150

import "strconv"

// EvaluateReversePolishNotation LeetCode 150
type EvaluateReversePolishNotation interface {
	evalRPN(tokens []string) int
}

type Solution1 struct{}

func (s Solution1) evalRPN(tokens []string) int {
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

type Solution2 struct{}

func (s Solution2) evalRPN(tokens []string) int {
	stack := make([]int, 0)
	for _, token := range tokens {
		if token == "+" {
			first, second := popTwoElements(&stack)
			stack = append(stack, first+second)
		} else if token == "-" {
			first, second := popTwoElements(&stack)
			stack = append(stack, first-second)
		} else if token == "*" {
			first, second := popTwoElements(&stack)
			stack = append(stack, first*second)
		} else if token == "/" {
			first, second := popTwoElements(&stack)
			stack = append(stack, first/second)
		} else {
			num, _ := strconv.Atoi(token)
			stack = append(stack, num)
		}
	}
	return stack[0]
}

func popTwoElements(stack *[]int) (int, int) {
	s := *stack
	first := s[len(s)-2]
	second := s[len(s)-1]
	*stack = s[:len(s)-2]
	return first, second
}
