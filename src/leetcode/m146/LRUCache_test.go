/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package m146

import (
	"fmt"
	"testing"
)

func TestLRUCache(t *testing.T) {
	cache := Constructor(2)

	cache.Put(1, 1)
	cache.Put(2, 2)
	if result := cache.Get(1); result != 1 {
		t.Errorf("Expected Get(1) to return 1, got %d", result)
	}

	cache.Put(3, 3) // evicts key 2
	if result := cache.Get(2); result != -1 {
		t.Errorf("Expected Get(2) to return -1 after eviction, got %d", result)
	}

	cache.Put(4, 4) // evicts key 1
	if result := cache.Get(1); result != -1 {
		t.Errorf("Expected Get(1) to return -1 after eviction, got %d", result)
	}

	if result := cache.Get(3); result != 3 {
		t.Errorf("Expected Get(3) to return 3, got %d", result)
	}

	if result := cache.Get(4); result != 4 {
		t.Errorf("Expected Get(4) to return 4, got %d", result)
	}
}

func main() {
	// Running the test
	TestLRUCache(nil)
	fmt.Println("All tests passed.")
}
