/**
 * @param {number[]} nums
 * @return {boolean}
 */
const containsDuplicate =(nums) =>{
    const numSet = new Set();
    for (const num of nums) {
        if (numSet.has(num)) {
            return true;
        }
        numSet.add(num);
    }
    return false;
}