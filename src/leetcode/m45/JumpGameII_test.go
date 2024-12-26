package m45

import "testing"

func Test_jump(t *testing.T) {
	tests := []struct {
		name     string
		nums     []int
		want     int
		jumpGame JumpGameII
	}{
		{"Test case 1", []int{2, 3, 1, 1, 4}, 2, Solution1{}},
		{"Test case 1", []int{2, 3, 1, 1, 4}, 2, Solution2{}},
		{"Test case 1", []int{2, 3, 0, 1, 4}, 2, Solution1{}},
		{"Test case 1", []int{2, 3, 0, 1, 4}, 2, Solution2{}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := tt.jumpGame.Jump(tt.nums); got != tt.want {
				t.Errorf("jump() = %v, want %v", got, tt.want)
			}
		})
	}
}
