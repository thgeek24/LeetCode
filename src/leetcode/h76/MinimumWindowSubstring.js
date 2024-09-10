/**
 * LeetCode 76
 *
 * @param {string} s
 * @param {string} t
 * @return {string}
 */
var minWindow = function (s, t) {
    let map = new Map;
    for (let i = 0; i < t.length; i++) {
        if (map.has(t[i])) {
            map.set(t[i], map.get(t[i]) + 1);
        } else {
            map.set(t[i], 1);
        }
    }

    let remaining = t.length;
    let minLen = Number.MAX_SAFE_INTEGER;
    let minRight;
    let left = 0;
    let right = 0;
    while (right < s.length) {
        let rightChar = s.charAt(right);
        if (map.has(rightChar)) {
            let count = map.get(rightChar);
            if (count > 0) {
                remaining--;
            }
            map.set(rightChar, --count);
        }
        right++;

        while (remaining === 0) {
            let leftChar = s.charAt(left);
            if (map.has(leftChar)) {
                let count = map.get(leftChar);
                if (count === 0) {
                    let newLen = right - left;
                    if (newLen < minLen) {
                        minLen = newLen;
                        minRight = right;
                    }
                    remaining++;
                }
                map.set(leftChar, ++count);
            }
            left++;
        }
    }

    if (minLen === Number.MAX_SAFE_INTEGER) {
        return "";
    }

    let startIndex = minRight - minLen;
    return s.substring(startIndex, minRight);
};

let s = "ADOBECODEBANC";
let t = "ABC";
console.log(minWindow(s, t));

s = "a";
t = "aa";
console.log(minWindow(s, t));