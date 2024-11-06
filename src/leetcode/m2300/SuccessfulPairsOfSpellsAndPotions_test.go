package m2300

import (
	"reflect"
	"testing"
)

func Test_successfulPairs(t *testing.T) {
	type args struct {
		spells  []int
		potions []int
		success int64
	}
	tests := []struct {
		name string
		args args
		want []int
	}{
		{"Test case 1", args{[]int{5, 1, 3}, []int{1, 2, 3, 4, 5}, 7}, []int{4, 0, 3}},
		{"Test case 2", args{[]int{3, 1, 2}, []int{8, 5, 8}, 16}, []int{2, 0, 2}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := successfulPairs(tt.args.spells, tt.args.potions, tt.args.success); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("successfulPairs() = %v, want %v", got, tt.want)
			}
		})
	}
}
