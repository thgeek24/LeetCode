package m86

import (
	"leetcode/src/leetcode/support"
	"reflect"
	"testing"
)

func Test_partition(t *testing.T) {
	type args struct {
		head *support.ListNode
		x    int
	}
	tests := []struct {
		name string
		args args
		want *support.ListNode
	}{
		{"Test case 1",
			args{head: &support.ListNode{Val: 1, Next: &support.ListNode{Val: 4, Next: &support.ListNode{Val: 3, Next: &support.ListNode{Val: 2, Next: &support.ListNode{Val: 5, Next: &support.ListNode{Val: 2}}}}}}, x: 3},
			&support.ListNode{Val: 1, Next: &support.ListNode{Val: 2, Next: &support.ListNode{Val: 2, Next: &support.ListNode{Val: 4, Next: &support.ListNode{Val: 3, Next: &support.ListNode{Val: 5}}}}}}},
		{"Test case 2",
			args{head: &support.ListNode{Val: 2, Next: &support.ListNode{Val: 1}}, x: 2},
			&support.ListNode{Val: 1, Next: &support.ListNode{Val: 2}}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := partition(tt.args.head, tt.args.x); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("partition() = %v, want %v", got, tt.want)
			}
		})
	}
}
