// LeetCode 2622
var TimeLimitedCache = function () {
  this.cache = new Map(); // Initialize the cache as a Map
};

/**
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function (key, value, duration) {
  const now = Date.now();
  const existing = this.cache.get(key);

  if (existing && existing.expiry > now) {
    // If key exists and hasn't expired, update it and return true
    this.cache.set(key, { value, expiry: now + duration });
    return true;
  }

  // Otherwise, add a new key-value pair and return false
  this.cache.set(key, { value, expiry: now + duration });
  return false;
};

/**
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function (key) {
  const now = Date.now();
  const entry = this.cache.get(key);

  if (!entry || entry.expiry <= now) {
    // If key doesn't exist or has expired, delete it and return -1
    this.cache.delete(key);
    return -1;
  }

  return entry.value; // Return the value if key is valid
};

/**
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function () {
  const now = Date.now();
  let activeKeys = 0;

  for (const [key, entry] of this.cache.entries()) {
    if (entry.expiry > now) {
      // Count non-expired keys
      activeKeys++;
    } else {
      // Remove expired keys
      this.cache.delete(key);
    }
  }

  return activeKeys;
};

/**
 * const timeLimitedCache = new TimeLimitedCache()
 * timeLimitedCache.set(1, 42, 1000); // false
 * timeLimitedCache.get(1) // 42
 * timeLimitedCache.count() // 1
 */
