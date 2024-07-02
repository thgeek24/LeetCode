/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 207
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/02 14:48
 */
public class CourseSchedule_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> courses = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            courses.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            courses.get(prerequisite[0]).add(prerequisite[1]);
        }

        int[] color = new int[numCourses]; // 0: unvisited, 1: visiting, 2: safe
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, courses, color)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int index, List<List<Integer>> courses, int[] color) {
        if (color[index] != 0) {
            return color[index] == 2;
        }
        color[index] = 1;
        for (int n : courses.get(index)) {
            if (!dfs(n, courses, color)) {
                return false;
            }
        }

        color[index] = 2;
        return true;
    }
}
