/**
 * LeetCode 2723
 *
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function addTwoPromises(promise1, promise2) {
    return Promise.all([promise1, promise2])
        .then(([result1, result2]) => result1 + result2);
}

promise1 = new Promise(resolve => setTimeout(() => resolve(2), 20));
promise2 = new Promise(resolve => setTimeout(() => resolve(5), 60));

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */
addTwoPromises(promise1, promise2).then(console.log);