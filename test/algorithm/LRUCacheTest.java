/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package algorithm;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/12 16:52
 */
public class LRUCacheTest {
    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(10);
        lRUCache.get(10);
        lRUCache.put(10, 13);
        lRUCache.put(3, 17);
        lRUCache.put(6, 11);
        lRUCache.put(10, 5);
        lRUCache.put(9, 10);
        lRUCache.get(13);
        lRUCache.put(2, 19);
        lRUCache.get(2);
        lRUCache.get(3);
        lRUCache.put(5, 25);
        lRUCache.get(8);
        lRUCache.put(9, 22);
        lRUCache.put(5, 5);
        lRUCache.put(1, 30);
        lRUCache.get(11);
        lRUCache.put(9, 12);
        lRUCache.get(7);
        lRUCache.get(5);
        lRUCache.get(8);
        lRUCache.get(9);
        lRUCache.put(4, 30);
        lRUCache.put(9, 3);
        lRUCache.get(9);
        lRUCache.get(10);
        lRUCache.get(10);
        lRUCache.put(6, 14);
        lRUCache.put(3, 1);
        lRUCache.get(3);
        lRUCache.put(10, 11);
        lRUCache.get(8);
        lRUCache.put(2, 14);
        lRUCache.get(1);
        lRUCache.get(5);
        lRUCache.get(4);
        lRUCache.put(11, 4);
        lRUCache.put(12, 24);
        lRUCache.put(5, 18);
        lRUCache.get(13);
        lRUCache.put(7, 23);
        lRUCache.get(8);
        lRUCache.get(12);
        lRUCache.put(3, 27);
        lRUCache.put(2, 12);
        lRUCache.get(5);
        lRUCache.put(2, 9);
        lRUCache.put(13, 4);
        lRUCache.put(8, 18);
        lRUCache.put(1, 7);
        lRUCache.get(6);
        lRUCache.put(9, 29);
        lRUCache.put(8, 21);
        lRUCache.get(5);
        lRUCache.put(6, 30);
        lRUCache.put(1, 12);
        lRUCache.get(10);
        lRUCache.put(4, 15);
        lRUCache.put(7, 22);
        lRUCache.put(11, 26);
        lRUCache.put(8, 17);
        lRUCache.put(9, 29);
        lRUCache.get(5);
        lRUCache.put(3, 4);
        lRUCache.put(11, 30);
        lRUCache.get(12);
        lRUCache.put(4, 29);
        lRUCache.get(3);
        lRUCache.get(9);
        lRUCache.get(6);
        lRUCache.put(3, 4);
        lRUCache.get(1);
        lRUCache.get(10);
        lRUCache.put(3, 29);
        lRUCache.put(10, 28);
        lRUCache.put(1, 20);
        lRUCache.put(11, 13);
        lRUCache.get(3);
        lRUCache.put(3, 12);
        lRUCache.put(3, 8);
        lRUCache.put(10, 9);
        lRUCache.put(3, 26);
        lRUCache.get(8);
        lRUCache.get(7);
        lRUCache.get(5);
        lRUCache.put(13, 17);
        lRUCache.put(2, 27);
        lRUCache.put(11, 15);
        lRUCache.get(12);
        lRUCache.put(9, 19);
        lRUCache.put(2, 15);
        lRUCache.put(3, 16);
        lRUCache.get(1);
        lRUCache.put(12, 17);
        lRUCache.put(9, 1);
        lRUCache.put(6, 19);
        lRUCache.get(4);
        lRUCache.get(5);
        lRUCache.get(5);
        lRUCache.put(8, 1);
        lRUCache.put(11, 7);
        lRUCache.put(5, 2);
        lRUCache.put(9, 28);
        lRUCache.get(1);
        lRUCache.put(2, 2);
        lRUCache.put(7, 4);
        lRUCache.put(4, 22);
        lRUCache.put(7, 24);
        lRUCache.put(9, 26);
        lRUCache.put(13, 28);
        lRUCache.put(11, 26);
    }
}
