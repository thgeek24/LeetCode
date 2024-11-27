package h773

import (
	"strconv"
	"strings"
)

// LeetCode 773
func slidingPuzzle(board [][]int) int {
	target := "123450"
	var sb strings.Builder
	for _, row := range board {
		for _, num := range row {
			sb.WriteString(strconv.Itoa(num))
		}
	}

	neighbors := [][]int{{1, 3}, {0, 2, 4}, {1, 5}, {0, 4}, {1, 3, 5}, {2, 4}}

	queue := &Queue{}
	visited := NewHashSet()
	queue.Enqueue(sb.String())
	visited.Add(sb.String())
	steps := 0
	for !queue.IsEmpty() {
		size := queue.Size()
		for i := 0; i < size; i++ {
			curr, _ := queue.Dequeue()
			if curr == target {
				return steps
			}

			zeroIndex := strings.Index(curr, "0")
			for _, neighbor := range neighbors[zeroIndex] {
				next := swap(curr, zeroIndex, neighbor)

				if !visited.Contains(next) {
					visited.Add(next)
					queue.Enqueue(next)
				}
			}
		}
		steps++
	}

	return -1
}

func swap(s string, i, j int) string {
	// Convert the string to a slice of runes to handle Unicode properly
	runes := []rune(s)

	// Swap the characters at the given indexes
	runes[i], runes[j] = runes[j], runes[i]

	// Convert the rune slice back to a string and return
	return string(runes)
}

// Queue represents a basic queue data structure
type Queue struct {
	data []string
}

// Enqueue adds an element to the end of the queue
func (q *Queue) Enqueue(value string) {
	q.data = append(q.data, value)
}

// Dequeue removes an element from the front of the queue
func (q *Queue) Dequeue() (string, bool) {
	if len(q.data) == 0 {
		return "", false // Queue is empty
	}
	val := q.data[0]
	q.data = q.data[1:] // Remove the front element
	return val, true
}

// IsEmpty checks if the queue is empty
func (q *Queue) IsEmpty() bool {
	return len(q.data) == 0
}

// Size returns the number of elements in the queue
func (q *Queue) Size() int {
	return len(q.data)
}

// HashSet represents a set using a map
type HashSet struct {
	set map[string]struct{}
}

// NewHashSet initializes a new HashSet
func NewHashSet() *HashSet {
	return &HashSet{
		set: make(map[string]struct{}),
	}
}

// Add inserts an element into the set
func (hs *HashSet) Add(value string) {
	hs.set[value] = struct{}{}
}

// Remove deletes an element from the set
func (hs *HashSet) Remove(value string) {
	delete(hs.set, value)
}

// Contains checks if the set contains the specified element
func (hs *HashSet) Contains(value string) bool {
	_, exists := hs.set[value]
	return exists
}

// Size returns the number of elements in the set
func (hs *HashSet) Size() int {
	return len(hs.set)
}
