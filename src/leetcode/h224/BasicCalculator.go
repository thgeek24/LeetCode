package h224

import (
	"strconv"
	"strings"
)

// LeetCode 224
func calculate(s string) int {
	stack := make([]string, 0)
	var builder strings.Builder
	for _, c := range s {
		switch c {
		case ' ':
			continue
		case ')':
			stack = append(stack, builder.String())
			builder.Reset()
			tempRes := calcStack(&stack)
			stack = append(stack, string(rune(tempRes)))
		case '(':
			stack = append(stack, builder.String())
			builder.Reset()
			stack = append(stack, string(c))
		case '+':
			if builder.Len() > 0 {
				stack = append(stack, builder.String())
				builder.Reset()
			}
		case '-':
			if builder.Len() > 0 {
				stack = append(stack, builder.String())
				builder.Reset()
			}
			builder.WriteRune(c)
		default:
			builder.WriteRune(c)
		}
	}
	if builder.Len() > 0 {
		stack = append(stack, builder.String())
	}
	res := 0
	for _, numStr := range stack {
		num, _ := strconv.Atoi(numStr)
		res += num
	}
	return res
}

func calcStack(stack *[]string) int {
	res := 0
	s := *stack
	for s[len(s)-1] != "(" {
		c := s[len(s)-1]
		s = s[:len(s)-1]
		num, _ := strconv.Atoi(c)
		res += num
	}
	s = s[:len(s)-1]
	if len(s) > 0 && s[len(s)-1] == "-" {
		s = s[:len(s)-1]
		return res * -1
	}
	if len(s) > 0 && s[len(s)-1] == "+" {
		s = s[:len(s)-1]
	}
	return res
}
