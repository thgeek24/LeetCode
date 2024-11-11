package m31

import (
	"reflect"
	"testing"
)

func Test_nextPermutation(t *testing.T) {
	tests := []struct {
		name string
		nums []int
		want []int
	}{
		{"Test case 1", []int{1, 2, 3}, []int{1, 3, 2}},
		{"Test case 2", []int{3, 2, 1}, []int{1, 2, 3}},
		{"Test case 3", []int{1, 1, 5}, []int{1, 5, 1}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			nextPermutation(tt.nums)
			if !reflect.DeepEqual(tt.nums, tt.want) {
				t.Errorf("after nextPermutation(), nums = %v, want %v", tt.nums, tt.want)
			}
		})
	}

}
