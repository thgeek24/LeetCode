package leetcode;

/**
 * @author taohong on 08/09/2018
 */
public class MaxSubarray {
    public int getMaxSubarray(int[] arr) {
        int tmpMax = 0, max = 0;
        for (int i : arr) {
            tmpMax = Math.max(0, tmpMax + i);
            max = Math.max(max, tmpMax);
        }
        return max;
    }

}
