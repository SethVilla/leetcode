// SquareRoot(x) https://leetcode.com/problems/sqrtx/
/**
 * @param {number} x
 * @return {number}
 */
const mySqrt = (x) => {
    if (x === 0) {
        return 0;
    }

    let left = 1;
    let right = x;
    let result = 0;

    while (left <= right) {
        const mid = Math.floor(left + (right - left) / 2);

        if (mid * mid <= x) {
            result = mid;
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return result;
};