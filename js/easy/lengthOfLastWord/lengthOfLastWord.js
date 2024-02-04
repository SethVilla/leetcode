// 58 Length of last word https://leetcode.com/problems/length-of-last-word/submissions/

/**
 * @param {string} s
 * @return {number}
 */
const lengthOfLastWord = (s) => {
    const words = s.trim().split(" ")
    return words[words.length - 1].length
};