package m135

import "testing"

func Test_candy(t *testing.T) {
	tests := []struct {
		name    string
		ratings []int
		want    int
	}{
		{"Test case 1", []int{1, 0, 2}, 5},
		{"Test case 2", []int{1, 2, 2}, 4},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := candy(tt.ratings); got != tt.want {
				t.Errorf("candy() = %v, want %v", got, tt.want)
			}
		})
	}
}
