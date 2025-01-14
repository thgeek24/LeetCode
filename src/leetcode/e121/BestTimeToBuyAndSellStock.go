package e121

// LeetCode 121
func maxProfit(prices []int) int {
	profit := 0
	minBuy := prices[0]
	for i := 1; i < len(prices); i++ {
		currProfit := prices[i] - minBuy
		profit = maxInt(currProfit, profit)
		minBuy = minInt(prices[i], minBuy)
	}
	return profit
}

func maxInt(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func minInt(a, b int) int {
	if a < b {
		return a
	}
	return b
}
