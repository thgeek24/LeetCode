package m75

import (
	"reflect"
	"testing"
)

func Test_sortColors(t *testing.T) {
	tests := []struct {
		name     string
		input    []int
		expected []int
	}{
		{"Test 1", []int{2, 0, 2, 1, 1, 0}, []int{0, 0, 1, 1, 2, 2}},
		{"Test 2", []int{2, 0, 1}, []int{0, 1, 2}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			sortColors(tt.input)
			if !reflect.DeepEqual(tt.input, tt.expected) {
				t.Errorf("Expected %v but got %v", tt.expected, tt.input)
			}
		})
	}
}
