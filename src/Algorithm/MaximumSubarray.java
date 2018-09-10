package Algorithm;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int tmp = 0;
        int max = nums[0];
        int start;
        int end;

        for (start = 0; start < nums.length; start++) {
            end = start;
            while (end < nums.length) {
                tmp = tmp + nums[end++];
                if (max < tmp) {
                    max = tmp;
                }
            }
            tmp = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray ms = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(ms.maxSubArray(nums));
    }
}
