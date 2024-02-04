//13 - Roman to Int https://leetcode.com/problems/roman-to-integer/

/**
 *
 * @param {string} s
 * @return {number}
 */
const romanToInt = function(s) {
    const romanNumToInt = {
        I: 1,
        V: 5,
        X: 10,
        L: 50,
        C: 100,
        D: 500,
        M: 1000
    }

    let total = 0;
    let i = 0;

    while (i < s.length) {
        if (romanNumToInt[s[i]] < romanNumToInt[s[i + 1]]) {
            total += romanNumToInt[s[i + 1]] - romanNumToInt[s[i]];
            i += 2;
        } else {
            total += romanNumToInt[s[i]];
            i++;
        }
    }
    return total;
};