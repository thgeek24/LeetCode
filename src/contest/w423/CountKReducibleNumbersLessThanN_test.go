package w423

import "testing"

func Test_countKReducibleNumbers(t *testing.T) {
	type args struct {
		s string
		k int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{"Test case 1", args{"111", 1}, 3},
		{"Test case 2", args{"1000", 2}, 6},
		{"Test case 3", args{"1", 3}, 0},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := countKReducibleNumbers(tt.args.s, tt.args.k); got != tt.want {
				t.Errorf("countKReducibleNumbers() = %v, want %v", got, tt.want)
			}
		})
	}
}
