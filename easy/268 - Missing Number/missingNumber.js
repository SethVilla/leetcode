// 268 - Missing Number https://leetcode.com/problems/missing-number/description/
/**
 * @param {number[]} nums
 * @return {number}
 */
const missingNumber = (nums) => {
    const n = nums.length;
    const totalSum = (n * (n + 1)) / 2;  // Sum of numbers from 0 to n using arithmetic progression formula
    const actualSum = nums.reduce((sum, num) => sum + num, 0);  // Sum of numbers in the given array

    return totalSum - actualSum;
};