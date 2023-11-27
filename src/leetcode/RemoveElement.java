package leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int len = 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (nums[i] != val && i < nums.length - 1) {
                i++;
            }
            while (nums[j] == val && j > 0) {
                j--;
            }
//            System.out.println("i: " + i + " j: " + j);
            if (i < j) {
                nums[i] = nums[j];
                nums[j] = val;
                i++;
                j--;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == val) {
                len = k;
                break;
            }
            if (k == nums.length - 1) {
                len = nums.length;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println("The length is: " + re.removeElement(nums, val));

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
