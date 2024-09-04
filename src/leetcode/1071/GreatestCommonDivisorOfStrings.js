/**
 * LeetCode 1071
 *
 * @param {string} str1
 * @param {string} str2
 * @return {string}
 */
var gcdOfStrings = function (str1, str2) {
    // Check the gcd of the two lengths
    let gcdLength = gcd(str1.length, str2.length);
    let candidate = str1.substring(0, gcdLength);

    // Check if the candidate string divides both str1 and str2
    if (isDivisible(str1, candidate) && isDivisible(str2, candidate)) {
        return candidate;
    }

    return "";
}

// Helper function to check if one string is the prefix of another
function isDivisible(s, t) {
    if (s.length % t.length !== 0) return false;
    let repeatTimes = s.length / t.length;
    return t.repeat(repeatTimes) === s;
}

// Calculate the GCD of the lengths of the two strings
function gcd(a, b) {
    return b === 0 ? a : gcd(b, a % b);
}

console.log(gcdOfStrings("LEET", "CODE"));