/**
 * LeetCode 2215
 *
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[][]}
 */
var findDifference = function (nums1, nums2) {
    let firstSet = new Set(nums1);
    let secondSet = new Set(nums2);
    let firstAns = new Set;
    let secondAns = new Set;

    firstSet.forEach(item => {
        if (!secondSet.has(item)) {
            firstAns.add(item);
        }
    });

    secondSet.forEach(item => {
        if (!firstSet.has(item)) {
            secondAns.add(item);
        }
    });

    return [Array.from(firstAns), Array.from(secondAns)];
};