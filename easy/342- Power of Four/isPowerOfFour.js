// 342. Power of Four - https://leetcode.com/problems/power-of-four/description/
/**
 * @param {number} n
 * @return {boolean}
 */
const isPowerOfFour = (n) => {
    if (n <= 0) {
        return false;
    }
    while (n % 4 === 0) {
        n /= 4;
    }
    return n === 1;
}





