/**
 * LeetCode 2623
 *
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const cache = {};
    return function (...args) {
        const key = JSON.stringify(args);
        if (cache[key] !== undefined) {
            return cache[key];
        }
        let val = fn(...args);
        cache[key] = val;
        return val;
    }
}


let callCount = 0;
const memoizedFn = memoize(function (a, b) {
    callCount += 1;
    return a + b;
})
let val1 = memoizedFn(2, 2); // 4
let val2 = memoizedFn(2, 2); // 4
console.log(val1);
console.log(val2);
console.log(callCount); // 1

