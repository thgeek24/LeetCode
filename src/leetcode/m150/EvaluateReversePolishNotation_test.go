package m150

import "testing"

func Test_evalRPN(t *testing.T) {
	tests := []struct {
		name   string
		tokens []string
		want   int
	}{
		{"Test case 1", []string{"2", "1", "+", "3", "*"}, 9},
		{"Test case 2", []string{"4", "13", "5", "/", "+"}, 6},
		{"Test case 3", []string{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}, 22},
	}

	solutions := []EvaluateReversePolishNotation{
		Solution1{},
		Solution2{},
	}

	for _, sol := range solutions {
		for _, tt := range tests {
			t.Run(tt.name, func(t *testing.T) {
				if got := sol.evalRPN(tt.tokens); got != tt.want {
					t.Errorf("evalRPN() = %v, want %v", got, tt.want)
				}
			})
		}
	}
}
