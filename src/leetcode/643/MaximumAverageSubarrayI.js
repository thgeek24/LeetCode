/**
 * LeetCode 643
 *
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function (nums, k) {
    let left = 0;
    let right = 0;
    let sum = 0;
    let maxAvg = Number.MIN_SAFE_INTEGER;
    while (right < nums.length) {
        while (right < nums.length && right - left < k) {
            sum += nums[right];
            right++;
        }
        maxAvg = Math.max(maxAvg, sum / k);
        sum -= nums[left];
        left++;
    }
    return maxAvg;
};