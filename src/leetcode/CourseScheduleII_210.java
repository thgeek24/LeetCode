/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 210
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/04 17:34
 */
public class CourseScheduleII_210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
            if (!dfs(i, color, courses, result)) {
                return new int[0];
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean dfs(int courseNum, int[] color, List<List<Integer>> courses, List<Integer> result) {
        if (color[courseNum] != 0) {
            return color[courseNum] == 2;
        }

        color[courseNum] = 1;
        for (int next : courses.get(courseNum)) {
            if (!dfs(next, color, courses, result)) {
                return false;
            }
        }
        color[courseNum] = 2;
        result.add(courseNum);
        return true;
    }
}
