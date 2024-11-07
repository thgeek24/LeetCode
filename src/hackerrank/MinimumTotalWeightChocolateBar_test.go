package hackerrank

import "testing"

func TestMinimumTotalWeightChocolateBar(t *testing.T) {
	type args struct {
		chocolates []int
		days       int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{"Test case", args{[]int{30, 20, 25}, 4}, 31},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := MinimumTotalWeightChocolateBar(tt.args.chocolates, tt.args.days); got != tt.want {
				t.Errorf("MinimumTotalWeightChocolateBar() = %v, want %v", got, tt.want)
			}
		})
	}
}
