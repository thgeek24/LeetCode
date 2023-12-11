package leetcode;

import java.util.Arrays;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/11 14:59
 */
public class SortAnArray_912 {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);
        left = sortArray(left);
        right = sortArray(right);
        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];

        int i = 0;
        int m = 0;
        int n = 0;
        while (m < left.length && n < right.length) {
            if (left[m] < right[n]) {
                res[i++] = left[m++];
            } else {
                res[i++] = right[n++];
            }
        }

        while (m < left.length) {
            res[i++] = left[m++];
        }

        while (n < right.length) {
            res[i++] = right[n++];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] test = {-2, 3, -5};
        SortAnArray_912 sortAnArray = new SortAnArray_912();
        int[] sorted = sortAnArray.sortArray(test);
        System.out.println(Arrays.toString(sorted));

    }
}
