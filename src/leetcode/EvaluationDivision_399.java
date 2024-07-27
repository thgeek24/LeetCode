/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 399
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/27 09:46
 */
public class EvaluationDivision_399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Integer> stringIndexes = new HashMap<>();
        int count = 0;
        for (List<String> equation : equations) {
            String a = equation.get(0);
            String b = equation.get(1);
            if (!stringIndexes.containsKey(a)) {
                stringIndexes.put(a, count++);
            }
            if (!stringIndexes.containsKey(b)) {
                stringIndexes.put(b, count++);
            }
        }
        double[][] matrix = new double[count][count];
        for (int i = 0; i < count; i++) {
            matrix[i][i] = 1;
        }
        // 使用除法结果给矩阵赋值
        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            int a = stringIndexes.get(equation.get(0));
            int b = stringIndexes.get(equation.get(1));
            if (a != b && matrix[a][b] == 0) {
                matrix[a][b] = values[i];
                matrix[b][a] = 1 / values[i];
            }
        }
        // Bellman-Ford algorithm
        for (int k = 0; k < count; k++) {
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (matrix[i][j] == 0 && matrix[i][k] != 0 && matrix[k][j] != 0) {
                        matrix[i][j] = matrix[i][k] * matrix[k][j];
                    }
                }
            }
        }

        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            int a = stringIndexes.getOrDefault(query.get(0), -1);
            int b = stringIndexes.getOrDefault(query.get(1), -1);
            if (a < 0 || b < 0) {
                res[i] = -1;
                continue;
            }
            res[i] = matrix[a][b] == 0 ? -1 : matrix[a][b];
        }
        return res;
    }
}
