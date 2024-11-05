/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package m146

// LeetCode 146
type Node struct {
	key, value int
	prev, next *Node
}

type LRUCache struct {
	capacity   int
	cache      map[int]*Node
	head, tail *Node
}

func Constructor(capacity int) LRUCache {
	head := &Node{}
	tail := &Node{}
	head.next = tail
	tail.prev = head
	return LRUCache{
		capacity: capacity,
		cache:    make(map[int]*Node),
		head:     head,
		tail:     tail,
	}
}

func (this *LRUCache) Get(key int) int {
	if node, ok := this.cache[key]; ok {
		this.moveToHead(node)
		return node.value
	}
	return -1
}

func (this *LRUCache) Put(key int, value int) {
	if node, ok := this.cache[key]; ok {
		node.value = value
		this.moveToHead(node)
	} else {
		newNode := &Node{key: key, value: value}
		this.cache[key] = newNode
		this.addToHead(newNode)
		if len(this.cache) > this.capacity {
			tail := this.removeTail()
			delete(this.cache, tail.key)
		}
	}
}

func (this *LRUCache) addToHead(node *Node) {
	node.prev = this.head
	node.next = this.head.next
	this.head.next.prev = node
	this.head.next = node
}

func (this *LRUCache) removeNode(node *Node) {
	node.prev.next = node.next
	node.next.prev = node.prev
}

func (this *LRUCache) moveToHead(node *Node) {
	this.removeNode(node)
	this.addToHead(node)
}

func (this *LRUCache) removeTail() *Node {
	tail := this.tail.prev
	this.removeNode(tail)
	return tail
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * obj := Constructor(capacity);
 * param_1 := obj.Get(key);
 * obj.Put(key,value);
 */
