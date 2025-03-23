package m71

import "testing"

func Test_simplifyPath(t *testing.T) {
	tests := []struct {
		name string
		path string
		want string
	}{
		{"Test case 1", "/home/", "/home"},
		{"Test case 2", "/home//foo/", "/home/foo"},
		{"Test case 3", "/home/user/Documents/../Pictures", "/home/user/Pictures"},
		{"Test case 4", "/../", "/"},
		{"Test case 5", "/.../a/../b/c/../d/./", "/.../b/d"},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := simplifyPath(tt.path); got != tt.want {
				t.Errorf("simplifyPath() = %v, want %v", got, tt.want)
			}
		})
	}
}
