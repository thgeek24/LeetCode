// LeetCode 2622
class TimeLimitedCacheSolution {
  cache: Map<number, any>;

  constructor() {
    this.cache = new Map();
  }

  set(key: number, value: number, duration: number): boolean {
    const now = Date.now();
    const existing = this.cache.get(key);

    if (existing && existing.expiry > now) {
      this.cache.set(key, { value, expiry: now + duration });
      return true;
    }
    this.cache.set(key, { value, expiry: now + duration });
    return false;
  }

  get(key: number): number {
    const now = Date.now();
    const existing = this.cache.get(key);

    if (existing && existing.expiry > now) {
      return existing.value;
    }
    this.cache.delete(key);
    return -1;
  }

  count(): number {
    const now = Date.now();
    let activeKeys = 0;

    for (const [key, entry] of this.cache.entries()) {
      if (entry.expiry > now) {
        activeKeys++;
      } else {
        this.cache.delete(key);
      }
    }
    return activeKeys;
  }
}

/**
 * const timeLimitedCache = new TimeLimitedCache()
 * timeLimitedCache.set(1, 42, 1000); // false
 * timeLimitedCache.get(1) // 42
 * timeLimitedCache.count() // 1
 */
