package hackerrank

import "container/heap"

// HackerRank 3 Mininum Total Weight
func MinimumTotalWeightChocolateBar(chocolates []int, days int) int {
	h := &MaxHeap{}
	heap.Init(h)
	for _, chocolate := range chocolates {
		heap.Push(h, chocolate)
	}
	for i := 0; i < days; i++ {
		chocolate := heap.Pop(h).(int)
		eaten := chocolate >> 1
		chocolate -= eaten
		heap.Push(h, chocolate)
	}
	sum := 0
	for h.Len() > 0 {
		sum += heap.Pop(h).(int)
	}
	return sum
}

// MaxHeap is a type that implements heap.Interface to create a max-heap.
type MaxHeap []int

// Len returns the length of the heap.
func (h MaxHeap) Len() int { return len(h) }

// Less defines the ordering for a max-heap (inverted for max-heap).
func (h MaxHeap) Less(i, j int) bool { return h[i] > h[j] }

// Swap swaps the elements at indexes i and j.
func (h MaxHeap) Swap(i, j int) { h[i], h[j] = h[j], h[i] }

// Push adds an element to the heap.
func (h *MaxHeap) Push(x any) {
	*h = append(*h, x.(int))
}

// Pop removes and returns the maximum element from the heap.
func (h *MaxHeap) Pop() any {
	old := *h
	n := len(old)
	max := old[n-1]
	*h = old[0 : n-1]
	return max
}
