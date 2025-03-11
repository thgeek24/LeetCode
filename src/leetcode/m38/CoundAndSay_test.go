package m38

import "testing"

func Test_countAndSay(t *testing.T) {
	tests := []struct {
		name string
		n    int
		want string
	}{
		{"Test case 1", 4, "1211"},
		{"Test case 2", 1, "1"},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := countAndSay(tt.n); got != tt.want {
				t.Errorf("countAndSay() = %v, want %v", got, tt.want)
			}
		})
	}
}
