/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package support;

import java.util.List;

/**
 * Utils to compare two lists
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/06/20 18:23
 */
public class ListComparator {
    private ListComparator() {
    }

    public static boolean equals(List<?> list1, List<?> list2) {
        if (list1 == list2) {
            return true;
        }
        if (list1 == null || list2 == null) {
            return false;
        }
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
