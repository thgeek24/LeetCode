package e228

import (
	"reflect"
	"testing"
)

// LeetCode 228
func Test_summaryRanges(t *testing.T) {
	tests := []struct {
		name string
		nums []int
		want []string
	}{
		{"Test case 1", []int{0, 1, 2, 4, 5, 7}, []string{"0->2", "4->5", "7"}},
		{"Test case 2", []int{0, 2, 3, 4, 6, 8, 9}, []string{"0", "2->4", "6", "8->9"}},
		{"Test case 3", []int{3, 5, 7}, []string{"3", "5", "7"}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := summaryRanges(tt.nums); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("summaryRanges() = %v, want %v", got, tt.want)
			}
		})
	}
}
