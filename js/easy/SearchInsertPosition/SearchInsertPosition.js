//35 - https://leetcode.com/problems/search-insert-position/description/
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
const searchInsert = function(nums, target) {
    for(let i = 0; i < nums.length; i++) {
        if (nums[i] < target && nums[i+1] > target) {
            return i + 1
        } else if (nums[i] === target) {
            return i
        } else if (i === 0 && nums[i] > target) {
            return i
        } else if (i === nums.length - 1) {
            return i + 1
        }
    }
};