// 28. Find the Index of the First Occurrence in a String https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
const strStr = function(haystack, needle) {
    const haystackLength = haystack.length;
    const needleLength = needle.length;

    for (let i = 0; i <= haystackLength - needleLength; i++) {
        let found = true;
        for (let j = 0; j < needleLength; j++) {
            if (haystack[i + j] !== needle[j]) {
                found = false;
                break;
            }
        }
        if (found) {
            return i;
        }
    }
    return -1;
};

const strStrBuiltIn = function (haystack, needle) {
    return haystack.indexOf(needle);
};