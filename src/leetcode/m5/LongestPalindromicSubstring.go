package m5

// LeetCode 5
func longestPalindrome(s string) string {
	res := ""
	for i := 0; i < len(s); i++ {
		str1 := longest(s, i, i)
		str2 := longest(s, i, i+1)
		if len(str1) > len(res) {
			res = str1
		}
		if len(str2) > len(res) {
			res = str2
		}
	}
	return res
}

func longest(s string, l, r int) string {
	for l >= 0 && r < len(s) && s[l] == s[r] {
		l--
		r++
	}
	return s[l+1 : r]
}
