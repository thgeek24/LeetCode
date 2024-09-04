/**
 * LeetCode 1768
 *
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function (word1, word2) {
    let res = '';
    const len1 = word1.length;
    const len2 = word2.length;
    const len = Math.min(len1, len2);
    for (let i = 0; i < len; i++) {
        res += word1[i] + word2[i];
    }
    const remaining = len1 > len2 ? word1 : word2;
    for (let i = len; i < remaining.length; i++) {
        res += remaining[i];
    }
    return res;
};

console.log(mergeAlternately('abc', 'pqr'));