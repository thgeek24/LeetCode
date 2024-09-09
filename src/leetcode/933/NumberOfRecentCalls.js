class RecentCounter {
    constructor() {
        this.queue = [];
    }

    ping(t) {
        this.queue.push(t);

        // Remove pings that are outside the 3000 ms window
        while (this.queue[0] < t - 3000) {
            this.queue.shift();
        }

        return this.queue.length;
    }
}

// Example usage:
let recentCounter = new RecentCounter();
console.log(recentCounter.ping(1));    // Output: 1
console.log(recentCounter.ping(100));  // Output: 2
console.log(recentCounter.ping(3001)); // Output: 3
console.log(recentCounter.ping(3002)); // Output: 3