// 231 - Power of Two https://leetcode.com/problems/power-of-two/description/
/**
 * @param {number} n
 * @return {boolean}
 */
function isPowerOfTwo(n) {
    if (n <= 0) {
        return false;
    }

    while (n % 2 === 0) {
        n /= 2;
    }

    return n === 1;
}