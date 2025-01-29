package m135

// LeetCode 135
func candy(ratings []int) int {
	n := len(ratings)
	candies := make([]int, n)
	for i := range candies {
		candies[i] = 1
	}

	for i := 1; i < n; i++ {
		if ratings[i] > ratings[i-1] {
			candies[i] = candies[i-1] + 1
		}
	}

	for i := n - 2; i >= 0; i-- {
		if ratings[i] > ratings[i+1] {
			candies[i] = maxInt(candies[i], candies[i+1]+1)
		}
	}

	sum := 0
	for _, cnt := range candies {
		sum += cnt
	}
	return sum
}

func maxInt(a, b int) int {
	if a > b {
		return a
	}
	return b
}
