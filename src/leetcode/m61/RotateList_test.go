package m61

import (
	"leetcode/src/leetcode/support"
	"reflect"
	"testing"
)

func Test_rotateRight(t *testing.T) {
	type args struct {
		head *support.ListNode
		k    int
	}
	tests := []struct {
		name string
		args args
		want *support.ListNode
	}{
		{
			name: "Test case 1: rotate 1->2->3->4->5 by 2",
			args: args{
				head: &support.ListNode{Val: 1, Next: &support.ListNode{Val: 2, Next: &support.ListNode{Val: 3, Next: &support.ListNode{Val: 4, Next: &support.ListNode{Val: 5}}}}},
				k:    2,
			},
			want: &support.ListNode{Val: 4, Next: &support.ListNode{Val: 5, Next: &support.ListNode{Val: 1, Next: &support.ListNode{Val: 2, Next: &support.ListNode{Val: 3}}}}},
		},
		{
			name: "Test case 2: rotate 0->1->2 by 4",
			args: args{
				head: &support.ListNode{Val: 0, Next: &support.ListNode{Val: 1, Next: &support.ListNode{Val: 2}}},
				k:    4,
			},
			want: &support.ListNode{Val: 2, Next: &support.ListNode{Val: 0, Next: &support.ListNode{Val: 1}}},
		},
		{
			name: "Test case 3: empty list",
			args: args{
				head: nil,
				k:    1,
			},
			want: nil,
		},
		{
			name: "Test case 4: single node",
			args: args{
				head: &support.ListNode{Val: 1},
				k:    1,
			},
			want: &support.ListNode{Val: 1},
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := rotateRight(tt.args.head, tt.args.k); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("rotateRight() = %v, want %v", got, tt.want)
			}
		})
	}
}
