//https://leetcode.com/problems/two-sum

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = function (nums, target) {
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] + nums[j] === target) {
        return [i, j];
      }
    }
  }
};

//Alternative solution for fun
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
 const twoSum = (nums, target) => nums.reduce((tuple, next, index) => {
  const arr1 = nums.slice(index + 1)
  const targetIndex = arr1.findIndex((value) => next + value === target)
  
  if(targetIndex > -1){
       tuple = [index, targetIndex + index + 1]
  }
  return tuple
}, [])
