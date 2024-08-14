/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link VersionControl.FirstBadVersion_278}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/12 09:41
 */
class FirstBadVersion_278Test {
    private VersionControl.FirstBadVersion_278 test;


    @Test
    void equalsFour() {
        int bad = 4;
        int n = 5;
        test = new VersionControl.FirstBadVersion_278(bad);
        assertEquals(bad, test.firstBadVersion(n));
    }

    @Test
    void equalsOne() {
        int bad = 1;
        int n = 1;
        test = new VersionControl.FirstBadVersion_278(bad);
        assertEquals(bad, test.firstBadVersion(n));
    }
}