/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package interview.cmbcloud;

import java.util.List;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/13 14:50
 */
public class SortTime {
    public List<String> sortTime(List<String> times){
        times.sort((time1, time2) -> {
            // Split the times into hours, minutes, and seconds
            String[] parts1 = time1.split(":");
            String[] parts2 = time2.split(":");

            // Parse hours, minutes, and seconds
            int h1 = Integer.parseInt(parts1[0]);
            int m1 = Integer.parseInt(parts1[1]);
            int s1 = Integer.parseInt(parts1[2]);

            int h2 = Integer.parseInt(parts2[0]);
            int m2 = Integer.parseInt(parts2[1]);
            int s2 = Integer.parseInt(parts2[2]);

            // Compare by seconds, then minutes, then hours
            if (s1 != s2) {
                return s1 - s2;
            }
            if (m1 != m2) {
                return m1 - m2;
            }
            return h1 - h2;
        });
        return times;
    }
}
