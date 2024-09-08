/**
 * LeetCode 1991
 * This is the same as LeetCode 724
 *
 * @param {number[]} nums
 * @return {number}
 */
var findMiddleIndex = function (nums) {
    let left = 0;
    let right = 0;
    for (let i = 1; i < nums.length; i++) {
        right += nums[i];
    }
    for (let i = 0; i < nums.length - 1; i++) {
        if (left === right) {
            return i;
        }
        left += nums[i];
        right -= nums[i + 1];
    }
    if (left === right) {
        return nums.length - 1;
    }
    return -1;
};