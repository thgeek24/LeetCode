var RecentCounter = function () {
    this.queue = [];
};

/**
 * @param {number} t
 * @return {number}
 */
RecentCounter.prototype.ping = function (t) {
    this.queue.push(t);

    while (this.queue[0] < t - 3000) {
        this.queue.shift();
    }
    return this.queue.length;
};

/**
 * Your RecentCounter object will be instantiated and called as such:
 * var obj = new RecentCounter()
 * var param_1 = obj.ping(t)
 */

// Example usage:
let recentCounter = new RecentCounter();
console.log(recentCounter.ping(1));    // Output: 1
console.log(recentCounter.ping(100));  // Output: 2
console.log(recentCounter.ping(3001)); // Output: 3
console.log(recentCounter.ping(3002)); // Output: 3