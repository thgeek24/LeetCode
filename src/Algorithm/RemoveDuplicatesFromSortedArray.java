package Algorithm;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            int tmp = nums[0];
            int len = 1;
            int index = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != tmp) {
                    tmp = nums[i];
                    nums[index] = tmp;
                    index++;
                    len++;
                }
            }
            return len;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5};
        int len = rd.removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
