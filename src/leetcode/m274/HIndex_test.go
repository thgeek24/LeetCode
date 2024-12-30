package m274

import "testing"

func Test_hIndex(t *testing.T) {
	tests := []struct {
		name      string
		citations []int
		want      int
	}{
		{"Test case 1", []int{3, 0, 6, 1, 5}, 3},
		{"Test case 2", []int{1, 3, 1}, 1},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := hIndex(tt.citations); got != tt.want {
				t.Errorf("hIndex() = %v, want %v", got, tt.want)
			}
		})
	}
}
