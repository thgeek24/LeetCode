package algorithm

// LeetCode 146
type LRUCache struct {
	lruMap    map[int]*Node
	capacity  int
	dummyHead *Node
}

func Constructor(capacity int) LRUCache {
	dummyHead := Node{key: -1, val: -1}
	return LRUCache{make(map[int]*Node), capacity, &dummyHead}
}

func (this *LRUCache) Get(key int) int {
	if node, exists := this.lruMap[key]; exists {
		if node.next == nil {
			return node.val
		}
		removeNode(node)
		addNode(this.dummyHead, node)
		return node.val
	}
	return -1
}

func (this *LRUCache) Put(key int, value int) {
	node, exists := this.lruMap[key]
	if exists {
		removeNode(node)
		node.val = value
		addNode(this.dummyHead, node)
	} else {
		if len(this.lruMap) == this.capacity {
			head := this.dummyHead.next
			removeNode(head)
			delete(this.lruMap, head.key)
		}
		node = &Node{key: key, val: value}
		addNode(this.dummyHead, node)
		this.lruMap[key] = node
	}
}

func removeNode(node *Node) {
	if node == nil {
		return
	}
	prev := node.prev
	next := node.next
	if prev != nil {
		prev.next = next
	}
	if next != nil {
		next.prev = prev
	}
	node.prev = nil
	node.next = nil
}

func addNode(head *Node, node *Node) {
	tail := head
	for tail.next != nil {
		tail = tail.next
	}
	tail.next = node

	node.prev = tail
	node.next = nil
}

type Node struct {
	key  int
	val  int
	prev *Node
	next *Node
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * obj := Constructor(capacity);
 * param_1 := obj.Get(key);
 * obj.Put(key,value);
 */
