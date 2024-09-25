/**
 * LeetCode 1207
 *
 * @param {number[]} arr
 * @return {boolean}
 */
var uniqueOccurrences = function (arr) {
    let map = new Map;
    for (let i = 0; i < arr.length; i++) {
        let num = arr[i];
        if (!map.has(num)) {
            map.set(num, 1);
        } else {
            let count = map.get(num);
            map.set(num, ++count);
        }
    }

    let size = map.size;
    let set = new Set(map.values());
    return set.size === size;
};