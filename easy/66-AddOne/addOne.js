//66. Plus One https://leetcode.com/problems/plus-one/description/
/**
 * @param {number[]} digits
 * @return {number[]}
 */
const plusOne = (digits) => {
    let carry = 1;
    const result = [];

    for (let i = digits.length - 1; i >= 0; i--) {
        const sum = digits[i] + carry;
        result.unshift(sum % 10);
        carry = Math.floor(sum / 10);
    }

    while (carry > 0) {
        result.unshift(carry % 10);
        carry = Math.floor(carry / 10);
    }

    return result;
};