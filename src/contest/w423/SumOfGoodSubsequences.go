package w423

const MOD = 1000000007

// LeetCode 3351
func sumOfGoodSubsequences(nums []int) int {
	count := [100003]int{}
	total := [100003]int{}
	sum := 0
	for _, num := range nums {
		count[num+1] = (count[num] + count[num+1] + count[num+2] + 1) % MOD
		curr := total[num] + total[num+2] + num*(count[num]+count[num+2]+1)
		total[num+1] = (total[num+1] + curr) % MOD
		sum = (sum + curr) % MOD
	}
	return sum
}
