/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 690
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/30 09:30
 */
public class EmployeeImportance_690 {
    private Map<Integer, Employee> employeeMap;

    public int getImportance(List<Employee> employees, int id) {
        employeeMap = new HashMap<>();
        for (Employee employee : employees) {
            employeeMap.put(employee.id, employee);
        }
        return getImportanceOfId(id);
    }

    private int getImportanceOfId(int id) {
        Employee employee = employeeMap.get(id);
        if (employee == null) {
            return 0;
        }
        int importance = employee.importance;
        List<Integer> subordinates = employee.subordinates;
        for (Integer subordinate : subordinates) {
            importance += getImportanceOfId(subordinate);
        }
        return importance;
    }
}
