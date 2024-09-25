/**
 * LeetCode 345
 *
 * @param {string} s
 * @return {string}
 */
const vowelsSet = new Set(['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', "U"]);

var reverseVowels = function (s) {
    let arr = s.split('');
    let left = 0;
    let right = s.length - 1;
    while (left < right) {
        while (!vowelsSet.has(arr[left]) && left < right) {
            left++;
        }
        while (!vowelsSet.has(arr[right]) && left < right) {
            right--;
        }
        if (left !== right) {
            let temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    return arr.join('');
};

console.log(reverseVowels('hello'));