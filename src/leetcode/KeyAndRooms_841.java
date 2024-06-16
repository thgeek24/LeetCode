/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.List;

/**
 * LeetCode 841
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/06/16 17:03
 */
public class KeyAndRooms_841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        dfs(rooms.get(0), rooms, visited);
        for (boolean item : visited) {
            if (!item) {
                return false;
            }
        }
        return true;
    }

    private void dfs(List<Integer> keys, List<List<Integer>> rooms, boolean[] visited) {
        keys.forEach(key -> {
            if (!visited[key]) {
                visited[key] = true;
                dfs(rooms.get(key), rooms, visited);
            }
        });
    }
}
