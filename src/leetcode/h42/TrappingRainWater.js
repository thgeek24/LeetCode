/**
 * LeetCode 42
 *
 * @param {number[]} height
 * @return {number}
 */
var trap = function (height) {
  let left = 0;
  let right = height.length - 1;
  let leftMax = 0;
  let rightMax = 0;
  let water = 0;

  while (left < right) {
    if (height[left] <= height[right]) {
      if (height[left] < leftMax) {
        water += leftMax - height[left];
      } else {
        leftMax = height[left];
      }
      left++;
    } else {
      if (height[right] < rightMax) {
        water += rightMax - height[right];
      } else {
        rightMax = height[right];
      }
      right--;
    }
  }
  return water;
};
