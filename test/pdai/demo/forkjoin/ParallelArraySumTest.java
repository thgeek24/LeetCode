/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.forkjoin;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ParallelArraySum}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/18 16:06
 */
class ParallelArraySumTest {
    @Test
    void testTwoThousand() {
        int len = 9999;
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= len; i++) {
            nums.add(i);
        }
        int[] array = nums.stream().mapToInt(Integer::intValue).toArray();

        long expected = 0L;
        for (int num : array) {
            expected += num;
        }

        ParallelArraySum parallel = new ParallelArraySum(array, 0, len);
        Long actual = parallel.invoke();

        assertEquals(expected, actual);
    }
}