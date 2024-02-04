/**
 * @param {number[]} nums
 * @return {number}
 */
const removeDuplicates = (nums) => {
  const numCount = {};

  for (let i = nums.length - 1; i >= 0; i--) {
    if (!numCount[nums[i]]) {
      numCount[nums[i]] = true;
    } else {
      nums.splice(i, 1);
    }
  }
  return nums.length;
};
