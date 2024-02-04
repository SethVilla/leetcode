// 345 Reverse Vowels of String https://leetcode.com/problems/reverse-vowels-of-a-string/description/

/**
 * @param {string} s
 * @return {string}
 */
const reverseVowels = (s) => {
    const vowels = "aeiouAEIOU";
    const sArray = s.split("");

    let left = 0;
    let right = sArray.length - 1;

    while (left < right) {
        while (left < right && vowels.indexOf(sArray[left]) === -1) {
            left++;
        }
        while (left < right && vowels.indexOf(sArray[right]) === -1) {
            right--;
        }

        const temp = sArray[left];
        sArray[left] = sArray[right];
        sArray[right] = temp;

        left++;
        right--;
    }

    return sArray.join("");
};