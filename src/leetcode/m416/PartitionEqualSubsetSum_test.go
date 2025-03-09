package m416

import "testing"

func Test_canPartition(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		{"Test 1", args{[]int{1, 5, 11, 5}}, true},
		{"Test 2", args{[]int{1, 2, 3, 5}}, false},
		{"Test 3", args{[]int{1, 2, 5}}, false},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := canPartition(tt.args.nums); got != tt.want {
				t.Errorf("canPartition() = %v, want %v", got, tt.want)
			}
		})
	}
}
