/**
 * LeetCode 1732
 *
 * @param {number[]} gain
 * @return {number}
 */
var largestAltitude = function (gain) {
    let highest = 0;
    let height = 0;
    for (let i = 0; i < gain.length; i++) {
        height += gain[i];
        highest = Math.max(highest, height);
    }
    return highest;
};