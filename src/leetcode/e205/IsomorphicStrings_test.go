package e205

import "testing"

func Test_isIsomorphic(t *testing.T) {
	type args struct {
		s string
		t string
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		{"Test case 1", args{"egg", "add"}, true},
		{"Test case 2", args{"foo", "bar"}, false},
		{"Test case 3", args{"paper", "title"}, true},
		{"Test case 4", args{"bbbaaaba", "aaabbbba"}, false},
		{"Test case 5", args{"ab", "aa"}, false},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := isIsomorphic(tt.args.s, tt.args.t); got != tt.want {
				t.Errorf("isIsomorphic() = %v, want %v", got, tt.want)
			}
		})
	}
}
