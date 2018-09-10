package Algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author taohong on 08/09/2018
 */
public class MaxSubarrayTest {
    MaxSubarray ms = new MaxSubarray();

    @Test
    public void getMaxSubarray() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, ms.getMaxSubarray(arr));
    }
}