package m289

import (
	"reflect"
	"testing"
)

func Test_gameOfLife(t *testing.T) {
	tests := []struct {
		name  string
		board [][]int
		want  [][]int
	}{
		{"Test case 1", [][]int{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}}, [][]int{{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}}},
		{"Test case 2", [][]int{{1, 1}, {1, 0}}, [][]int{{1, 1}, {1, 1}}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			gameOfLife(tt.board)
			if !reflect.DeepEqual(tt.board, tt.want) {
				t.Errorf("after gameOfLife(), board = %v, want %v", tt.board, tt.want)
			}
		})
	}
}
