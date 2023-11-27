package leetcode;

import org.junit.jupiter.api.Test;

import javax.annotation.Resource;


/**
 * @author taohong on 05/09/2018
 */
public class ConvertSortedArrayToBinarySearchTreeTest {

    @Resource
    ConvertSortedArrayToBinarySearchTree ct = new ConvertSortedArrayToBinarySearchTree();

    @Test
    public void sortedArrayToBST() {
        int[] nums = {-10, -3, 0, 5, 9};
        ct.sortedArrayToBST(nums);
    }
}