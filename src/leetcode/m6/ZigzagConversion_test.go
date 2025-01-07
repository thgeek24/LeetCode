package main

import "testing"

func Test_convert(t *testing.T) {
	type args struct {
		s       string
		numRows int
	}
	tests := []struct {
		name string
		args args
		want string
	}{
		{"Test case 1", args{"PAYPALISHIRING", 3}, "PAHNAPLSIIGYIR"},
		{"Test case 2", args{"PAYPALISHIRING", 4}, "PINALSIGYAHRPI"},
		{"Test case 3", args{"A", 1}, "A"},
		{"Test case 4", args{"AB", 1}, "AB"},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := convert(tt.args.s, tt.args.numRows); got != tt.want {
				t.Errorf("convert() = %v, want %v", got, tt.want)
			}
		})
	}
}
