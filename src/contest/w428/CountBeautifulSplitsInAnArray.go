package w428

const mod = int(1e9 + 7)
const base = 31

// LeetCocde 3388
func beautifulSplits(nums []int) int {
	n := len(nums)
	if n < 3 {
		return 0
	}

	pow := make([]int, n+1)
	prefixHash := make([]int, n+1)

	pow[0] = 1
	for i := 1; i < n+1; i++ {
		pow[i] = pow[i-1] * base % mod
		prefixHash[i] = (prefixHash[i-1]*base + nums[i-1]) % mod
	}

	count := 0
	for i := 1; i < n-1; i++ {
		for j := i + 1; j < n; j++ {
			isPrefix := false

			if isPrefixSum(0, i, i, j, prefixHash, pow) {
				isPrefix = true
			}

			if isPrefixSum(i, j, j, n, prefixHash, pow) {
				isPrefix = true
			}

			if isPrefix {
				count++
			}
		}
	}
	return count
}

func isPrefixSum(start1, end1, start2, end2 int, hash, pow []int) bool {
	len1 := end1 - start1
	len2 := end2 - start2
	if len1 > len2 {
		return false
	}

	hash1 := (hash[end1] - hash[start1]*pow[len1]%mod + mod) % mod
	hash2 := (hash[start2+len1] - hash[start2]*pow[len1]%mod + mod) % mod
	return hash1 == hash2
}
