//https://leetcode.com/problems/palindrome-number/submissions/

//Given an integer x, return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

/**
 * @param {number} x
 * @return {boolean}
 */
 var isPalindrome = function(x) {
    if(x.toString()[0] === '-') {
        return false
    }
    let numToStr = x.toString();
    let reverseStr = numToStr.split("").reverse().join("");
};