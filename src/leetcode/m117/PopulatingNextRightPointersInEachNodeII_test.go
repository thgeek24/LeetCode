package m117

import (
	"reflect"
	"testing"
)

func Test_connect(t *testing.T) {
	tests := []struct {
		name string
		root *Node
		want *Node
	}{
		{"Test case 1", &Node{Val: 1,
			Left:  &Node{Val: 2, Left: &Node{Val: 4}, Right: &Node{Val: 5}},
			Right: &Node{Val: 3, Right: &Node{Val: 7}}},
			&Node{Val: 1,
				Left:  &Node{Val: 2, Left: &Node{Val: 4}, Right: &Node{Val: 5}},
				Right: &Node{Val: 3, Right: &Node{Val: 7}}},
		},
		{"Test case 2", &Node{}, &Node{}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := connect(tt.root); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("connect() = %v, want %v", got, tt.want)
			}
		})
	}
}
