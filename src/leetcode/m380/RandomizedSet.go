package m380

import "math/rand"

// LeetCode 380
type RandomizedSet struct {
	list   []int
	intMap map[int]int
}

func Constructor() RandomizedSet {
	return RandomizedSet{
		list:   make([]int, 0),
		intMap: make(map[int]int),
	}
}

func (this *RandomizedSet) Insert(val int) bool {
	if _, ok := this.intMap[val]; ok {
		return false
	}
	this.list = append(this.list, val)
	this.intMap[val] = len(this.list) - 1
	return true
}

func (this *RandomizedSet) Remove(val int) bool {
	if idx, ok := this.intMap[val]; ok {
		lastVal := this.list[len(this.list)-1]
		this.list[idx] = lastVal
		this.intMap[lastVal] = idx
		this.list = this.list[:len(this.list)-1]
		delete(this.intMap, val)
		return true
	}
	return false
}

func (this *RandomizedSet) GetRandom() int {
	return this.list[rand.Intn(len(this.list))]
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.Insert(val);
 * param_2 := obj.Remove(val);
 * param_3 := obj.GetRandom();
 */
