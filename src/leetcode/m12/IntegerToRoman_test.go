package m12

import "testing"

func Test_intToRoman(t *testing.T) {
	tests := []struct {
		name string
		num  int
		want string
	}{
		{"Test case 1", 3749, "MMMDCCXLIX"},
		{"Test case 2", 58, "LVIII"},
		{"Test case 3", 1994, "MCMXCIV"},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := intToRoman(tt.num); got != tt.want {
				t.Errorf("intToRoman() = %v, want %v", got, tt.want)
			}
		})
	}
}
