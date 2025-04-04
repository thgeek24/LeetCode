package m57

import (
	"reflect"
	"testing"
)

func Test_insert(t *testing.T) {
	type args struct {
		intervals   [][]int
		newInterval []int
	}
	tests := []struct {
		name string
		args args
		want [][]int
	}{
		{"Test case 1", args{[][]int{{1, 3}, {6, 9}}, []int{2, 5}}, [][]int{{1, 5}, {6, 9}}},
		{"Test case 2", args{[][]int{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, []int{4, 8}}, [][]int{{1, 2}, {3, 10}, {12, 16}}},
		{"Test case 3", args{[][]int{{1, 2}, {3, 5}}, []int{6, 7}}, [][]int{{1, 2}, {3, 5}, {6, 7}}},
		{"Test case 4", args{[][]int{}, []int{5, 7}}, [][]int{{5, 7}}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := insert(tt.args.intervals, tt.args.newInterval); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("insert() = %v, want %v", got, tt.want)
			}
		})
	}
}
