// 1089 - Duplicate Zeros https://leetcode.com/problems/duplicate-zeros/
/**
 * @param {number[]} arr
 * @return {void} Do not return anything, modify arr in-place instead.
 */
const duplicateZeros = (arr) => {
    const length = arr.length;
    let zerosCount = 0;

    for (let i = 0; i < length; i++) {
        if (arr[i] === 0) {
            zerosCount++;
        }
    }

    let i = length - 1;
    let j = length + zerosCount - 1;

    while (i !== j) {
        if (j < length) {
            arr[j] = arr[i];
        }

        j--;

        if (arr[i] === 0) {
            if (j < length) {
                arr[j] = 0;
            }
            j--;
        }

        i--;
    }
};