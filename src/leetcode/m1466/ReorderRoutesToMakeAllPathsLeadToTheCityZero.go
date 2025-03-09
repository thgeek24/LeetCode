package m1466

import (
	"container/list"
	"fmt"
)

func minReorder(n int, connections [][]int) int {
	graph := make([][]int, n)
	directedEdges := map[string]bool{}

	for _, conn := range connections {
		from, to := conn[0], conn[1]
		graph[from] = append(graph[from], to)
		graph[to] = append(graph[to], from)
		directedEdges[fmt.Sprintf("%d,%d", from, to)] = true
	}

	visited := make([]bool, n)
	visited[0] = true
	changes := 0
	queue := list.New()
	queue.PushBack(0)
	for queue.Len() > 0 {
		curr := queue.Remove(queue.Front()).(int)
		for _, neighbour := range graph[curr] {
			if !visited[neighbour] { // 检查 curr 的邻居是否被访问过，而不是 curr 本身
				if !directedEdges[fmt.Sprintf("%d,%d", neighbour, curr)] {
					changes++
				}
				queue.PushBack(neighbour)
				visited[neighbour] = true
			}
		}
	}
	return changes
}
