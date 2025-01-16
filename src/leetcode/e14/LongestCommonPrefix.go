package e14

// LeetCode 14
func longestCommonPrefix(strs []string) string {
	prefix := strs[0]
	for i := 1; i < len(strs); i++ {
		prefix = longestSharedPrefix(prefix, strs[i])
		if len(prefix) == 0 {
			return ""
		}
	}
	return prefix
}

func longestSharedPrefix(str1, str2 string) string {
	i := 0
	for i < len(str1) && i < len(str2) && str1[i] == str2[i] {
		i++
	}
	return str1[:i]
}
