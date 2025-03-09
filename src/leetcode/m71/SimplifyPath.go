package m71

import "strings"

// LeetCode 71
func simplifyPath(path string) string {
	paths := strings.Split(path, "/")
	res := make([]string, 0)
	for _, item := range paths {
		if item == "" || item == "." {
			continue
		}
		if item == ".." {
			if len(res) > 0 {
				res = res[:len(res)-1]
			}
			continue
		}
		res = append(res, item)
	}
	return "/" + strings.Join(res, "/")
}
