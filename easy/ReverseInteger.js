//https://leetcode.com/problems/reverse-integer/

// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

/**
 * @param {number} x
 * @return {number}
 */
var reverse = function (x) {
  let numToString = x.toString();

  let isNegative = numToString[0] === "-";
  if (isNegative) {
    let result = numToString.split("").reverse();
    result.pop();

    if (Number(result.join("")) > Math.pow(2, 31)) return 0;
    result.unshift("-");
    return Number(result.join("")) > Math.pow(2, 31)
      ? 0
      : Number(result.join(""));
  }

  return Number(x.toString().split("").reverse().join("")) > Math.pow(2, 31)
    ? 0
    : Number(x.toString().split("").reverse().join(""));
};
