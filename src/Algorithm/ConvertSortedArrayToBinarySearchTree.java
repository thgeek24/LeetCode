package Algorithm;

import java.util.Arrays;

/**
 * @author taohong on 05/09/2018
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        } else if (nums.length == 1) {
            return new TreeNode(nums[0]);
        } else if (nums.length == 2) {
            TreeNode tnTmp = new TreeNode(nums[1]);
            tnTmp.left = new TreeNode(nums[0]);
            return tnTmp;
        } else {
            int len = nums.length;
            TreeNode tn = new TreeNode(nums[len / 2]);
            tn.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, len / 2));
            tn.right = sortedArrayToBST(Arrays.copyOfRange(nums, len / 2 + 1, len));
            return tn;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int[] subNums = Arrays.copyOfRange(nums, 1, 0);
        System.out.println(subNums);
    }
}
