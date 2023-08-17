// 326. Power of Three https://leetcode.com/problems/power-of-three/
/**
 * @param {number} n
 * @return {boolean}
 */
const isPowerOfThree = (n) => {
    if (n <= 0) {
        return false;
    }

    while (n % 3 === 0) {
        n /= 3;
    }

    return n === 1;
}