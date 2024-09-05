/**
 * LeetCode 605
 *
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
var canPlaceFlowers = function (flowerbed, n) {
    let i = 0;
    while (n > 0 && i < flowerbed.length) {
        if (check(flowerbed, i)) {
            flowerbed[i] = 1;
            n--;
        }
        i++;
    }
    return n === 0;
};

const check = (flowerbed, index) => {
    if (flowerbed[index] === 1) {
        return false;
    }
    if (flowerbed.length === 1) {
        return true;
    }
    if (index === 0) {
        return flowerbed[index + 1] !== 1;
    }
    if (index === flowerbed.length - 1) {
        return flowerbed[index - 1] !== 1;
    }
    return flowerbed[index - 1] !== 1 && flowerbed[index + 1] !== 1;
}

const flowerbed = [1, 0, 0, 0, 1];
console.log(canPlaceFlowers(flowerbed, 2));