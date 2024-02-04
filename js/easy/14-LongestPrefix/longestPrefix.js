// Longest Common Prefix - https://leetcode.com/problems/longest-common-prefix/description/

/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".*/

/**
 *
 * @param {string[]} strs
 * @return {string}
 */
const longestCommonPrefix = function(strs) {
    let commonPrefix = ''
    const prefix = strs.reduce((shortestWord, words) => words.length < shortestWord.length ? words : shortestWord);
    for(let i = 0; i < prefix.length; i++) {
        const char = prefix[i];
        for (const word of strs) {
            console.log(word)
            if (word[i] !== char) {
                return commonPrefix;
            }
        }
        commonPrefix += char;
    }
    return commonPrefix;
};