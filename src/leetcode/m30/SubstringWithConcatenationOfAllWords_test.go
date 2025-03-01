package m30

import (
	"reflect"
	"testing"
)

func Test_findSubstring(t *testing.T) {
	type args struct {
		s     string
		words []string
	}
	tests := []struct {
		name string
		args args
		want []int
	}{
		{"Test case 1", args{"barfoothefoobarman", []string{"foo", "bar"}}, []int{0, 9}},
		{"Test case 2", args{"wordgoodgoodgoodbestword", []string{"word", "good", "best", "word"}}, []int{}},
		{"Test case 3", args{"barfoofoobarthefoobarman", []string{"bar", "foo", "the"}}, []int{6, 9, 12}},
		{"Test case 4", args{"lingmindraboofooowingdingbarrwingmonkeypoundcake", []string{"fooo", "barr", "wing", "ding", "wing"}}, []int{13}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := findSubstring(tt.args.s, tt.args.words); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("findSubstring() = %v, want %v", got, tt.want)
			}
		})
	}
}
